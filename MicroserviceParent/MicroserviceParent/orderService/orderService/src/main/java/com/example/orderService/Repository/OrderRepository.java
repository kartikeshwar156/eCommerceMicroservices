package com.example.orderService.Repository;


import com.example.orderService.Entity.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<ProductOrder, String> {
}
