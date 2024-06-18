package com.company.softwaremarket.repositories;

import com.company.softwaremarket.models.entities.CompanyEntity;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<CompanyEntity,Long> {
}
