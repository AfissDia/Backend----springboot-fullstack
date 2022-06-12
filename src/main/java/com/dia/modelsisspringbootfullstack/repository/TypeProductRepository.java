package com.dia.modelsisspringbootfullstack.repository;

import com.dia.modelsisspringbootfullstack.model.TypeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeProductRepository extends JpaRepository<TypeProduct,Integer> {
}
