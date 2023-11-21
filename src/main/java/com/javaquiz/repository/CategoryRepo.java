package com.javaquiz.repository;

import com.javaquiz.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {


}
