package com.johancanon.springcloud.ms.products.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johancanon.springcloud.ms.products.entities.Product;
import com.johancanon.springcloud.ms.products.services.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService  productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all-products")
    public ResponseEntity< List<Product> > list(){
        return ResponseEntity.ok( this.productService.findAll() );
    }

    @GetMapping("/{id}")
    public ResponseEntity< Product > details( @PathVariable Long id ){
        var optionalProduct = this.productService.findById( id );
        if ( optionalProduct.isPresent() ) {
            return ResponseEntity.ok( optionalProduct.orElseThrow() );
        }
        return ResponseEntity.notFound().build();
    }

}
