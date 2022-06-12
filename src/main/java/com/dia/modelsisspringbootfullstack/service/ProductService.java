package com.dia.modelsisspringbootfullstack.service;

import com.dia.modelsisspringbootfullstack.model.Product;
import com.dia.modelsisspringbootfullstack.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    public void saveProduct(Product product){
        productRepository.save(product);
    }
    public Optional<Product> findById(int id){
        return productRepository.findById(id);
    }
    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }
}
