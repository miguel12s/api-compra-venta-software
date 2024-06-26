package com.company.softwaremarket.services.impl;

import com.company.softwaremarket.models.entities.UserEntity;
import com.company.softwaremarket.repositories.UserRepository;
import com.company.softwaremarket.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserImplService implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity findViewById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Set<UserEntity> findAll() {
        return (Set<UserEntity>) userRepository.findAll();
    }
}
