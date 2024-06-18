package com.company.softwaremarket.services;

import com.company.softwaremarket.models.entities.CompanyEntity;
import com.company.softwaremarket.repositories.CompanyRepository;

import java.util.List;
import java.util.Set;

public interface CompanyService {

    CompanyEntity save(CompanyEntity companyEntity);
    Set<CompanyRepository> findAll();
    CompanyEntity findById(Long id);
}
