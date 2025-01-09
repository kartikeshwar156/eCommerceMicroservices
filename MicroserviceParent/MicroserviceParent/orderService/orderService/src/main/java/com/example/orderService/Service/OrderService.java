package com.example.orderService.Service;

import com.example.orderService.Entity.ProductOrder;
import com.example.orderService.FeignClients.ProductClient;
import com.example.orderService.Repository.OrderRepository;
import com.example.productService.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private static Logger logger = LoggerFactory.getLogger(OrderService.class);


    private static final Logger log = LoggerFactory.getLogger(OrderService.class);
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductClient productClient;

    public List<ProductOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    public ProductOrder getOrderById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    public ProductOrder addOrder(ProductOrder order) {
        Product product = productClient.getProductById(order.getProductId());
        logger.info("something fetched from client  -----|----- " + product);
        if (product != null) {
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
}
