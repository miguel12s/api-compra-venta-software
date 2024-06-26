package com.company.softwaremarket.services.impl;

import com.company.softwaremarket.models.entities.PerfilEntity;
import com.company.softwaremarket.repositories.PerfilRepository;
import com.company.softwaremarket.services.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PerfilServiceImpl implements PerfilService {

    @Autowired

    private PerfilRepository perfilRepository;

    @Override
    public Set<PerfilEntity> findAll() {
        return (Set<PerfilEntity>) perfilRepository.findAll();
    }

    @Override
    public PerfilEntity findById(Long id) {
        return perfilRepository.findById(id).orElse(null);
    }

    @Override
    public PerfilEntity save(PerfilEntity perfil) {
        return perfilRepository.save(perfil);
    }

    @Override
    public Boolean existsById(Long id) {
        return perfilRepository.existsById(id);
    }
}
