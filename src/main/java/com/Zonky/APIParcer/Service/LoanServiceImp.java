package com.Zonky.APIParcer.Service;

import com.Zonky.APIParcer.DTO.LoanDTO;
import com.Zonky.APIParcer.Entity.Loan;
import com.Zonky.APIParcer.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanServiceImp implements LoanService {

    private LoanRepository loanRepository;

    @Autowired
    public LoanServiceImp(LoanRepository loanRepository){
        this.loanRepository = loanRepository;
    }

    @Override
    public boolean checkLoanItemIsExist(LoanDTO loanDTO) {
        return false;
    }

    @Override
    public Loan saveLoanItem(Loan loan) {
        return loanRepository.save(loan);

    }
}
