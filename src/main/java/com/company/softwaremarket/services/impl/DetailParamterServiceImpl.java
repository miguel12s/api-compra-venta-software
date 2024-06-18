package com.company.softwaremarket.services.impl;

import com.company.softwaremarket.models.entities.DetailsParameterEntity;
import com.company.softwaremarket.repositories.DetailParameterRepository;
import com.company.softwaremarket.services.DetailParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailParamterServiceImpl implements DetailParameterService {
    @Autowired
    DetailParameterRepository detailParameterRepository;

    @Override
    public DetailsParameterEntity save(DetailsParameterEntity detailsParameter) {
        return detailParameterRepository.save(detailsParameter);
    }

    @Override
    public List<DetailsParameterEntity> findAll() {
        return (List<DetailsParameterEntity>) detailParameterRepository.findAll();
    }

    @Override
    public DetailsParameterEntity findById(Long id) {
        return detailParameterRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean existById(Long id) {
        return detailParameterRepository.existsById(id);
    }
}

