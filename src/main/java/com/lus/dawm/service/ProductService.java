package com.lus.dawm.service;

import com.lus.dawm.model.Produit;
import com.lus.dawm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Produit addProduct(Produit produit){
        return productRepository.save(produit);
    }
    public List<Produit> getAllProducts() {
        return productRepository.findAll();
    }
}
