package com.Zonky.APIParcer;

import com.Zonky.APIParcer.DTO.LoanDTO;
import com.Zonky.APIParcer.Service.LoanService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ListIterator;

@Component
public class Receiver {

    ObjectMapper objectMapper = new ObjectMapper();
    ListIterator loanIerator;
    List<LoanDTO> listLoanDTOS;
    LoanDTO loanDTOItem;
    private LoanService loanService;

    @Autowired
    public Receiver(LoanService loanService) { this.loanService = loanService; }

    @Scheduled(fixedRate = 30000)
    public void checkAPI() throws IOException {
        listLoanDTOS = objectMapper.readValue(new URL("https://api.zonky.cz/loans/marketplace"),new TypeReference<List<LoanDTO>>(){});
        loanIerator = listLoanDTOS.listIterator();
        while (loanIerator.hasNext()){
            loanDTOItem = (LoanDTO) loanIerator.next();
            if (!loanService.checkLoanItemIsExist(loanDTOItem)) {
                loanService.dtoToEntity(loanDTOItem);
                //loanService.saveLoanItem(loanDTOItem);
            }
            else {
                break;
            }
        }
    }
}
