package com.javaquiz.service;

import com.javaquiz.entity.SpringCat;
import com.javaquiz.repository.SpringRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringService {

    private final SpringRepo springRepo;

    public SpringService(SpringRepo springRepo) {
        this.springRepo = springRepo;
    }

    public List<SpringCat> getAllCategories() {
        return springRepo.findAll();
    }

    public List<SpringCat> getSpringItemsByCategoryId(Long categoryId) {
        return springRepo.findByCategoryId(categoryId);
    }

}
