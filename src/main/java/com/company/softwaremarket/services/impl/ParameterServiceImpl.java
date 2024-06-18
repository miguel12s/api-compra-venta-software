package com.company.softwaremarket.services.impl;

import com.company.softwaremarket.models.entities.ParameterEntity;
import com.company.softwaremarket.repositories.ParameterRepository;
import com.company.softwaremarket.services.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParameterServiceImpl implements ParameterService {
    @Autowired
    ParameterRepository parameterRepository;

    @Override
    public ParameterEntity save(ParameterEntity parameter) {
        return parameterRepository.save(parameter);
    }

    @Override
    public List<ParameterEntity> findAll() {
        return (List<ParameterEntity>) parameterRepository.findAll();
    }

    @Override
    public ParameterEntity findById(String id) {
        return parameterRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean existById(String id) {
        return parameterRepository.existsById(id);
    }
}
