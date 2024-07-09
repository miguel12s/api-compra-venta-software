package com.company.softwaremarket.services;

import com.company.softwaremarket.models.entities.ProductEntity;

import java.util.List;
import java.util.Set;

public interface ProductService {

    ProductEntity save(ProductEntity productEntity);
    List<ProductEntity> findAll();
    ProductEntity findById(Long id);
    Boolean existById(Long id);


}
