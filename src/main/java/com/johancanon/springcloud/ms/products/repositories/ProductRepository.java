package com.johancanon.springcloud.ms.products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.johancanon.springcloud.ms.products.entities.Product;

public interface ProductRepository extends CrudRepository< Product, Long > {

}
