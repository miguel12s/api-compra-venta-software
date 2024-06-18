package com.company.softwaremarket.repositories;

import com.company.softwaremarket.models.entities.ParameterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterRepository extends CrudRepository<ParameterEntity,String> {
}
