package com.example.InventoryService.Service;

import com.example.InventoryService.Entity.Inventory;
import com.example.InventoryService.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;


    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryByProductId(String productId) {
        return inventoryRepository.findById(productId).orElse(null);
    }

    public Inventory saveProductId(String productId) {
        Inventory curProduct = new Inventory();
        curProduct.setProductId(productId);
        curProduct.setQuantity(0);
        return inventoryRepository.save(curProduct);
    }

    public Inventory updateInventory(String productId, int quantity) {
        Inventory inventory = inventoryRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        inventory.setQuantity(quantity);
        return inventoryRepository.save(inventory);
    }
}
