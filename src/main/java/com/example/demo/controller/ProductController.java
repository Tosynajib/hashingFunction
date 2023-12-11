package com.example.demo.controller;

import com.example.demo.dto.ProductRequestDto;
import com.example.demo.service.ProductionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {


    private final ProductionService productionService;


    @PostMapping("/create-bottle")
    public void createSpitSoft(@RequestBody ProductRequestDto productRequestDto){
        this.productionService.createBottle(productRequestDto);
    }


}
