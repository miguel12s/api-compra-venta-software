package com.company.softwaremarket.services;

import com.company.softwaremarket.models.entities.PerfilEntity;

import java.util.List;
import java.util.Set;

public interface PerfilService {
     List<PerfilEntity> findAll();
     PerfilEntity findById(Long id);
     PerfilEntity save(PerfilEntity perfil);
     Boolean existsById(Long id);
}
