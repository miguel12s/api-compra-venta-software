package com.company.softwaremarket.services;

import com.company.softwaremarket.models.entities.ParameterEntity;


import java.util.List;

public interface ParameterService {

    ParameterEntity save(ParameterEntity role);
    List<ParameterEntity> findAll();
    ParameterEntity findById(String id);
    Boolean existById(String id);


}
