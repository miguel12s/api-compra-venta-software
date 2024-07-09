package com.company.softwaremarket.services.impl;

import com.company.softwaremarket.models.entities.ProductEntity;
import com.company.softwaremarket.repositories.ProductRepository;
import com.company.softwaremarket.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired

    private ProductRepository productRepository;

    @Override
    public ProductEntity save(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public List<ProductEntity> findAll() {
        return (List<ProductEntity>) productRepository.findAll();
    }

    @Override
    public ProductEntity findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean existById(Long id) {
        return productRepository.existsById(id);
    }
}
