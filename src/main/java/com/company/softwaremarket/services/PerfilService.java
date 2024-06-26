package com.company.softwaremarket.services;

import com.company.softwaremarket.models.entities.PerfilEntity;

import java.util.Set;

public interface PerfilService {
     Set<PerfilEntity> findAll();
     PerfilEntity findById(Long id);
     PerfilEntity save(PerfilEntity perfil);
     Boolean existsById(Long id);
}
