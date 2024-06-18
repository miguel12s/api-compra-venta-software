package com.company.softwaremarket.controller;

import com.company.softwaremarket.dto.RoleDto;
import com.company.softwaremarket.models.entities.DetailsParameterEntity;
import com.company.softwaremarket.services.impl.DetailParamterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/v1/detail-parameter")
public class DetailParameterController {
    @Autowired
    DetailParamterServiceImpl detailParameterService;
    @PostMapping
    public ResponseEntity<?> saveDetailParameter(@RequestBody DetailsParameterEntity parameter){
        return new ResponseEntity<>(detailParameterService.save(parameter), HttpStatus.CREATED);
    }
    @GetMapping

    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(detailParameterService.findAll(), HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateDetailParameter(@PathVariable("id") Long id, @RequestBody DetailsParameterEntity parameter){
        if(detailParameterService.existById(id)){
            return new ResponseEntity<>(detailParameterService.save(parameter), HttpStatus.CREATED);
        }
        RoleDto roleDto= RoleDto.builder()
                .messageError("parameter details not found")
                .build();
        return new ResponseEntity<>(roleDto, HttpStatus.NOT_FOUND);
    }
}
