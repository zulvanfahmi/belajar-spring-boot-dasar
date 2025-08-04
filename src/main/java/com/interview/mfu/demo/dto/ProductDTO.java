package com.interview.mfu.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String product_name;
}
