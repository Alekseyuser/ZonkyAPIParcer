package com.Zonky.APIParcer.Mapper;

import com.Zonky.APIParcer.DTO.LoanDTO;
import com.Zonky.APIParcer.Entity.Loan;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component
public class LoanDTOToEntityMapper extends PropertyMap<LoanDTO, Loan> {

    ModelMapper modelMapper = new ModelMapper();
    private Loan loanEntity;

    public Loan loadDTOToEntity(LoanDTO loanDTO){

        loanEntity = modelMapper.map(loanDTO,Loan.class);
        loanEntity.setPhotoId(loanDTO.getp);
        return loanEntity;


    }


        @Override
        protected void configure() {
            //skip(source.getPhotoDTOS(),destination.getPhotoId());
            //skip(source.getInsuranceHistoryDTO(),destination.getInsuranceHistoryId());
            skip(source.getPhotoDTOS());
            skip(source.getInsuranceHistoryDTO());
            skip(destination.getPhotoId());
            skip(destination.getInsuranceHistoryId());

        }

}
