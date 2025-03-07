package com.johancanon.springcloud.ms.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.johancanon.springcloud.ms.products.entities.Product;
import com.johancanon.springcloud.ms.products.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional( readOnly = true )
    public List<Product> findAll() {
        return ( List<Product> ) productRepository.findAll();
    }

    @Override
    @Transactional( readOnly = true)
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

}
