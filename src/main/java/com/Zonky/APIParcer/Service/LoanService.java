package com.Zonky.APIParcer.Service;

import com.Zonky.APIParcer.Entity.Loan;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface LoanService {
    public boolean checkLoanItemIsExist(Loan loan);
    public Loan saveLoanItem(Loan loan);
}
