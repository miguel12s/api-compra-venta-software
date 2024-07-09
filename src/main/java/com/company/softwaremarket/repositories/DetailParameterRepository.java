package com.company.softwaremarket.repositories;

import com.company.softwaremarket.models.entities.DetailsParameterEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DetailParameterRepository extends CrudRepository<DetailsParameterEntity, Long>{

    @Query("SELECT d FROM DetailsParameterEntity  d WHERE d.valueDetail = :description")

    DetailsParameterEntity findByDescription(String description);





}
