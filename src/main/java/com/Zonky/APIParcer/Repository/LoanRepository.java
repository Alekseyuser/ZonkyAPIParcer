package com.Zonky.APIParcer.Repository;

import com.Zonky.APIParcer.Entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends  JpaRepository<Loan, Integer> {
}
