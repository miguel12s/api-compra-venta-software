package com.company.softwaremarket.services.impl;

import com.company.softwaremarket.models.entities.UserEntity;
import com.company.softwaremarket.repositories.UserRepository;
import com.company.softwaremarket.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public List<UserEntity> findAll() {
        return (List<UserEntity>) userRepository.findAll();
    }

    @Override
    public Set<String> findRoleByUserId(Long userId) {
        return userRepository.findRoleByUserId(userId);
    }
}
