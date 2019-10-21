package com.Zonky.APIParcer;

import com.Zonky.APIParcer.Entity.Loan;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
@Component
public class Receiver {

    ObjectMapper objectMapper = new ObjectMapper();

    //@Scheduled(fixedRate = 30000)
    @Scheduled(fixedRate = 20000)
    public void checkAPI() throws IOException {
        List<Loan> listLoans = objectMapper.readValue(new URL("https://api.zonky.cz/loans/marketplace"),new TypeReference<List<Loan>>(){});
        Loan l = listLoans.get(3); Loan l2 = listLoans.get(4);
        System.out.println(l.getAmount() + " : " + l.getNickName());
        System.out.println(l2.getAmount() + " : " + l2.getNickName());
    }
}
