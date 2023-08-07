package com.example.DataJPA_1.repository;

import com.example.DataJPA_1.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.lang.invoke.SerializedLambda;

public interface ProductRepository extends CrudRepository<Product, SerializedLambda> {
}
