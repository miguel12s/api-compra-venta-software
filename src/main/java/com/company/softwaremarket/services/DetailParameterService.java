package com.company.softwaremarket.services;

import com.company.softwaremarket.models.entities.DetailsParameterEntity;
import com.company.softwaremarket.models.entities.ParameterEntity;

import java.util.List;

public interface DetailParameterService {
    DetailsParameterEntity save(DetailsParameterEntity detailsParameter);
    List<DetailsParameterEntity> findAll();
    DetailsParameterEntity findById(Long id);
    Boolean existById(Long id);
    DetailsParameterEntity findByDescription(String description);


}
