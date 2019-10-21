package com.Zonky.APIParcer.Service;

import com.Zonky.APIParcer.Entity.Loan;
import com.Zonky.APIParcer.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class LoanServiceImp implements LoanService {

    private LoanRepository loanRepository;

    @Autowired
    public LoanServiceImp(LoanRepository loanRepository){
        this.loanRepository = loanRepository;
    }

    @Override
    public boolean checkLoanItemIsExist(Loan loan) {
        //loanRepository.exists() //https://www.baeldung.com/spring-data-exists-query
        return false;
    }

    @Override
    public Loan saveLoanItem(Loan loan) {
        return loanRepository.save(loan);

    }
}
