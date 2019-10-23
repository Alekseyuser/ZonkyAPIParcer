package com.Zonky.APIParcer.Service;

import com.Zonky.APIParcer.DTO.LoanDTO;
import com.Zonky.APIParcer.Entity.Loan;
import org.springframework.stereotype.Service;

@Service
public interface LoanService {
    public boolean checkLoanItemIsExist(LoanDTO loanDTO);
    public Loan saveLoanItem(Loan loan);
    public Loan dtoToEntity(LoanDTO loanDTO);
}
