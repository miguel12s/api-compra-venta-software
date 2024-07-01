package com.company.softwaremarket.controller;

import com.company.softwaremarket.dto.ResponseDto;
import com.company.softwaremarket.models.entities.ParameterEntity;
import com.company.softwaremarket.services.impl.ParameterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/parameter")
@RestController
public class ParemeterController {

    @Autowired
    ParameterServiceImpl parameterService;


    @PostMapping
    public ResponseEntity<ParameterEntity> saveParameter(@RequestBody ParameterEntity parameter){
        ParameterEntity parameterEntity=parameterService.save(parameter);
        return new  ResponseEntity<>(parameterEntity, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ParameterEntity>> findAll(){
        List<ParameterEntity> parameterEntityList= parameterService.findAll();
        return new ResponseEntity<>(parameterEntityList,HttpStatus.OK);
    }


    @PutMapping("/{parameter}")

    public ResponseEntity<?> updateRole(@PathVariable("parameter") String parameter,@RequestBody ParameterEntity parameterEntity){
        if(parameterService.existById(parameter)){
            return new ResponseEntity<>(parameterService.save(parameterEntity),HttpStatus.CREATED);
        }
        ResponseDto responseDto= ResponseDto.builder()
                .message("parameter not found")
                .code(400)
                .build();
        return new ResponseEntity<>(responseDto,HttpStatus.NOT_FOUND);
    }
}
