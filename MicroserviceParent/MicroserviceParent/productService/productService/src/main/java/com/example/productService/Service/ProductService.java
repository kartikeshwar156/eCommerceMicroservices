package com.example.productService.Service;
import com.example.productService.FeignClient.InventoryClient;
import com.example.productService.Repository.ProductRepository;
import com.example.productService.entity.Inventory;
import com.example.productService.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private InventoryClient inventoryClient;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product addProduct(Product product) {
        Inventory newProductAdd = inventoryClient.registerProductInventory(product.getId());
        return productRepository.save(product);
    }
}
