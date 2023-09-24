package com.ntica.productservice.controller;

import com.ntica.productservice.dto.ProductRequest;
import com.ntica.productservice.dto.ProductResponse;
import com.ntica.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct(@RequestBody ProductRequest productRequest){
        String id = productService.createProduct(productRequest);
        return id;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }

}
