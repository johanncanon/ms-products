package com.johancanon.springcloud.ms.products.services;

import java.util.List;
import java.util.Optional;

import com.johancanon.springcloud.ms.products.entities.Product;

public interface ProductService {

    List<Product> findAll();
    Optional<Product> findById(Long id);

}
