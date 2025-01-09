package com.example.orderService.Controller;

import com.example.orderService.Entity.ProductOrder;
import com.example.orderService.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderServiceController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<ProductOrder> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ProductOrder getOrderById(@PathVariable String id) {
        return orderService.getOrderById(id);
    }

    @PostMapping
    public ProductOrder addOrder(@RequestBody ProductOrder order) {
        return orderService.addOrder(order);
    }
}
