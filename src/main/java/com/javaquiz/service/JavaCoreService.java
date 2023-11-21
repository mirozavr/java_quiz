package com.javaquiz.service;

import com.javaquiz.entity.JavaCoreCat;
import com.javaquiz.repository.JavaCoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JavaCoreService {

    private final JavaCoreRepo javaCoreRepo;

    @Autowired
    public JavaCoreService(JavaCoreRepo javaCoreRepo) {
        this.javaCoreRepo = javaCoreRepo;
    }

    public List<JavaCoreCat> getAllCategories() {
        return javaCoreRepo.findAll();
    }

    public List<JavaCoreCat> getJavaCoreItemsByCategoryId(Long categoryId) {
        return javaCoreRepo.findByCategoryId(categoryId);
    }
}
