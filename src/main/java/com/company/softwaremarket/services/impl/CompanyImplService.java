package com.company.softwaremarket.services.impl;

import com.company.softwaremarket.models.entities.CompanyEntity;
import com.company.softwaremarket.repositories.CompanyRepository;
import com.company.softwaremarket.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
@Service
public class CompanyImplService implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public CompanyEntity save(CompanyEntity companyEntity) {
        return companyRepository.save(companyEntity);
    }

    @Override
    public Set<CompanyRepository> findAll() {
        return new HashSet((Collection) companyRepository.findAll());
    }

    @Override
    public CompanyEntity findById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }
}
