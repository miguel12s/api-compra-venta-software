package com.company.softwaremarket.controller;


import com.company.softwaremarket.models.entities.CompanyEntity;
import com.company.softwaremarket.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/company")
@RestController
public class CompanyController {
@Autowired
    CompanyRepository companyRepository;

    @PostMapping

    public ResponseEntity<?> saveCompany(@RequestBody CompanyEntity companyEntity){
        return new ResponseEntity<>(companyRepository.save(companyEntity), HttpStatus.CREATED);

    }


    @GetMapping



    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(companyRepository.findAll(), HttpStatus.OK);
    }



}
