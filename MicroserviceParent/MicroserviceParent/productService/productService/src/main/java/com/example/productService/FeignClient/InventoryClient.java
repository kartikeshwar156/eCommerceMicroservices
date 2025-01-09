package com.example.productService.FeignClient;

import com.example.productService.entity.Inventory;
import com.example.productService.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "inventoryService")
public interface InventoryClient {
    @PostMapping("/inventory/{id}")
    Inventory registerProductInventory(@PathVariable String id);
}
