package com.Zonky.APIParcer;

import com.Zonky.APIParcer.Entity.Loan;
import com.Zonky.APIParcer.Service.LoanService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.ListIterator;

@Component
public class Receiver {

    ObjectMapper objectMapper = new ObjectMapper();
    ListIterator loanIerator;
    List<Loan> listLoans;
    Loan loanItem;
    private LoanService loanService;

    @Autowired
    public Receiver(LoanService loanService) { this.loanService = loanService; }

    @Scheduled(fixedRate = 30000)
    public void checkAPI() throws IOException {
        listLoans = objectMapper.readValue(new URL("https://api.zonky.cz/loans/marketplace"),new TypeReference<List<Loan>>(){});
        loanIerator = listLoans.listIterator();
        while (loanIerator.hasNext()){
            loanItem = (Loan) loanIerator.next();
            if (!loanService.checkLoanItemIsExist(loanItem)) {
                loanService.saveLoanItem(loanItem);
            }
        }
    }
}
