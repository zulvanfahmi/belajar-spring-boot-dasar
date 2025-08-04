package com.interview.mfu.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.mfu.demo.dto.ProductDTO;
import com.interview.mfu.demo.services.ProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    @Autowired
    private ProductService productsService;

    @GetMapping("/product")
    public ResponseEntity<List<ProductDTO>> getAllProducts() {

        List<ProductDTO> products = productsService.getAllProducts();

        return ResponseEntity.ok(products);

    }
    
}
