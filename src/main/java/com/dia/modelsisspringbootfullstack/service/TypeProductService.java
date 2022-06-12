package com.dia.modelsisspringbootfullstack.service;

import com.dia.modelsisspringbootfullstack.model.TypeProduct;
import com.dia.modelsisspringbootfullstack.repository.TypeProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeProductService {
    @Autowired private TypeProductRepository typeProductRepository;

    public List<TypeProduct> getAllTypeProduct(){
        return typeProductRepository.findAll();
    }
    public void save(TypeProduct typeProduct){
        typeProductRepository.save(typeProduct);
    }
    public Optional<TypeProduct> findById(int id){
        return typeProductRepository.findById(id);
    }
    public void deleteTypeProduct(Integer id){
        typeProductRepository.deleteById(id);
    }
}