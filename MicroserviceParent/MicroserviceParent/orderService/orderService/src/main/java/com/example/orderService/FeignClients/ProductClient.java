package com.example.orderService.FeignClients;

import com.example.productService.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "productService")
public interface ProductClient {

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable String id);
}
