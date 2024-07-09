package com.company.softwaremarket.services;

import com.company.softwaremarket.models.entities.UserEntity;

import java.util.List;
import java.util.Set;

public interface UserService {

    UserEntity save(UserEntity userEntity);
    UserEntity findViewById(Long id);
    List<UserEntity> findAll();
    Set<String> findRoleByUserId(Long userId);

}
