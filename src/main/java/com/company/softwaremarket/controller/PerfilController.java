package com.company.softwaremarket.controller;


import com.company.softwaremarket.models.entities.PerfilEntity;
import com.company.softwaremarket.services.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequestMapping("api/v1/perfil")
@RestController

public class PerfilController {

    @Autowired
    private PerfilService perfilService;
    @GetMapping

    public ResponseEntity<Set<PerfilEntity>> findPerfilAll() {
        return new ResponseEntity<>(perfilService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PerfilEntity> findPerfilById( @PathVariable Long id) {
        return new ResponseEntity<>(perfilService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PerfilEntity> savePerfil(@RequestBody  PerfilEntity perfil) {
        return new ResponseEntity<>(perfilService.save(perfil), HttpStatus.CREATED);
    }






}
