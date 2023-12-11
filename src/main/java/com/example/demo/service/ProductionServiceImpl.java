package com.example.demo.service;

import com.example.demo.dto.ProductRequestDto;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductionServiceImpl implements ProductionService {

    private final ProductRepository productRepository;

    @Override
    public void createBottle(ProductRequestDto productRequestDto) {
        Product product = new Product();
        product.setName(productRequestDto.getName());
        this.productRepository.save(product);

    }
}
