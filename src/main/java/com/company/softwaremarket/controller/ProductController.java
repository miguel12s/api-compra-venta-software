package com.company.softwaremarket.controller;
import com.company.softwaremarket.dto.ResponseDto;
import com.company.softwaremarket.models.entities.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.company.softwaremarket.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/product/")
@RestController

public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping

    public ResponseEntity<?> findAll() {


        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);

    }

    @GetMapping("{id}")

    public ResponseEntity<?> findById(@PathVariable Long id){
        if(productService.existById(id)){
            return new ResponseEntity<>(productService.findById(id),HttpStatus.OK);
        }
        ResponseDto responseDto= ResponseDto.builder()
                .message("Product not found")
                .code(400)
                .build();
        return new ResponseEntity<>(responseDto,HttpStatus.NOT_FOUND);
    }


    @PostMapping

    public ResponseEntity<?> save(@RequestBody ProductEntity productEntity){

        ProductEntity productEntity1= productService.save(productEntity);
        if(productEntity1==null){
            ResponseDto responseDto= ResponseDto.builder()
                    .message("Product not saved")
                    .code(400)
                    .build();
            return new ResponseEntity<>(responseDto,HttpStatus.BAD_REQUEST);

        }

        return new ResponseEntity<>(productEntity1,HttpStatus.CREATED);
    }



}
