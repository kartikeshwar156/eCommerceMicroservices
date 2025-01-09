package com.example.productService.Repository;

import com.example.productService.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductRepository extends JpaRepository<Product, String> {

}
