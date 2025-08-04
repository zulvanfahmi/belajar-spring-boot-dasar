package com.interview.mfu.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.interview.mfu.demo.dto.ProductDTO;
import com.interview.mfu.demo.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query(nativeQuery = true, value = "select * from product")
    public List<ProductDTO> getAllProducts();

    
}