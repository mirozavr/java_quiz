package com.javaquiz.repository;

import com.javaquiz.entity.SpringCat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringRepo extends JpaRepository<SpringCat, Long> {

    List<SpringCat> findByCategoryId(Long categoryId);
}
