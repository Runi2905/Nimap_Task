package com.ty.Ecommerce.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Ecommerce.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
