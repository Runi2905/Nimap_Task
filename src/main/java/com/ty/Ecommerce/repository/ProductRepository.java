package com.ty.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
