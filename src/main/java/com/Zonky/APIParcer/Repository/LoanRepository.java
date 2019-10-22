package com.Zonky.APIParcer.Repository;

import com.Zonky.APIParcer.DTO.LoanDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends  JpaRepository<LoanDTO, Integer> {
}
