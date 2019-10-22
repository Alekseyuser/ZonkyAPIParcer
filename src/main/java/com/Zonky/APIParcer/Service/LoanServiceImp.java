package com.Zonky.APIParcer.Service;

import com.Zonky.APIParcer.Entity.Loan;
import com.Zonky.APIParcer.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoanServiceImp implements LoanService {

    private LoanRepository loanRepository;

    @Autowired
    public LoanServiceImp(LoanRepository loanRepository){
        this.loanRepository = loanRepository;
    }

    @Override
    public boolean checkLoanItemIsExist(Loan loan) {
        return loanRepository.existsById(loan.getId());
    }

    @Override
    public Loan saveLoanItem(Loan loan) {
        return loanRepository.save(loan);

    }
}
