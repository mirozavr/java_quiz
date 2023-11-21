package com.javaquiz.repository;

import com.javaquiz.entity.JavaCoreCat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JavaCoreRepo extends JpaRepository<JavaCoreCat, Long> {

    List<JavaCoreCat> findByCategoryId(Long categoryId);

}
