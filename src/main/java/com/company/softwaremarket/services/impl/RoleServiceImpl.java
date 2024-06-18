package com.company.softwaremarket.services.impl;

import com.company.softwaremarket.models.entities.RoleEntity;
import com.company.softwaremarket.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.softwaremarket.services.RoleService;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RoleEntity save(RoleEntity role) {
        return roleRepository.save(role);
    }

    @Override
    public List<RoleEntity> findAll() {
        return (List<RoleEntity>) roleRepository.findAll();
    }

    @Override
    public RoleEntity findById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean existById(Long id) {
        return roleRepository.existsById(id);
    }
}
