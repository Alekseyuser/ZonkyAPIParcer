package com.Zonky.APIParcer.Service;

import com.Zonky.APIParcer.DTO.LoanDTO;
import com.Zonky.APIParcer.Entity.Loan;
import com.Zonky.APIParcer.Mapper.LoanDTOToEntityMapper;
import com.Zonky.APIParcer.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanServiceImp implements LoanService {

    private LoanRepository loanRepository;
    private LoanDTOToEntityMapper loanDTOToEntityMapper;
    private Loan loanEntity;

    @Autowired
    public LoanServiceImp(LoanRepository loanRepository, LoanDTOToEntityMapper loanDTOToEntityMapper){
        this.loanRepository = loanRepository;
        this.loanDTOToEntityMapper = loanDTOToEntityMapper;
    }

    @Override
    public boolean checkLoanItemIsExist(LoanDTO loanDTO) {
        return false;
    }

    @Override
    public Loan saveLoanItem(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public Loan dtoToEntity(LoanDTO loanDTO){
        loanEntity = loanDTOToEntityMapper.loadDTOToEntity(loanDTO);
        System.out.println(loanEntity.getId());
        System.out.println(loanEntity.getPhotoId());

        return loanEntity;
    }
}
