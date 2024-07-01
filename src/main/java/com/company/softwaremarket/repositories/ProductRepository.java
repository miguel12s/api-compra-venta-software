package com.company.softwaremarket.repositories;

import com.company.softwaremarket.models.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity,Long> {
}
