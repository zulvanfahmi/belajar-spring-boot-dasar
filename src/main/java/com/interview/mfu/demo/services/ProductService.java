package com.interview.mfu.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.mfu.demo.dto.ProductDTO;
import com.interview.mfu.demo.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getAllProducts() {

        return productRepository.getAllProducts();

    }
    
}
