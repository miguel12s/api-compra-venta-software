package com.company.softwaremarket.repositories;

import com.company.softwaremarket.models.entities.PerfilEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends CrudRepository<PerfilEntity,Long> {
}
