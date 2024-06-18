package com.company.softwaremarket.controller;


import com.company.softwaremarket.dto.RoleDto;
import com.company.softwaremarket.models.entities.RoleEntity;
import com.company.softwaremarket.repositories.RoleRepository;
import com.company.softwaremarket.services.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(value="api/v1/role")
@RestController
public class RoleController {
    @Autowired
    RoleServiceImpl roleService;


    @PostMapping
    public ResponseEntity<RoleEntity> saveRole(@RequestBody RoleEntity role){
        System.out.println(role.toString());
        RoleEntity roleEntity=roleService.save(role);
        return new  ResponseEntity<>(roleEntity,HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<RoleEntity>> findAll(){
        List<RoleEntity> roleEntityList= roleService.findAll();
        return new ResponseEntity<>(roleEntityList,HttpStatus.OK);
    }


    @PutMapping("/{id}")

    public ResponseEntity<?> updateRole(@PathVariable("id") Long id,@RequestBody RoleEntity role){
        if(roleService.existById(id)){
          return new ResponseEntity<>(roleService.save(role),HttpStatus.CREATED);
        }
        RoleDto roleDto= RoleDto.builder()
                .messageError("Role not found")
                .build();
        return new ResponseEntity<>(roleDto,HttpStatus.NOT_FOUND);
    }
}
