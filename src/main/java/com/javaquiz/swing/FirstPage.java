package com.javaquiz.swing;

import com.javaquiz.entity.Category;
import com.javaquiz.entity.JavaCoreCat;
import com.javaquiz.entity.SpringCat;
import com.javaquiz.service.CategoryService;
import com.javaquiz.service.JavaCoreService;
import com.javaquiz.service.SpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

@Component
public class FirstPage extends JFrame {
    private final CategoryService categoryService;
    private final JavaCoreService javaCoreService;
    private final SpringService springService;

    @Autowired
    public FirstPage(CategoryService categoryService, JavaCoreService javaCoreService, SpringService springService) {
        this.categoryService = categoryService;
        this.javaCoreService = javaCoreService;
        this.springService = springService;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);

        JPanel buttonsPanel = new JPanel();
        add(buttonsPanel);

        List<Category> categories = categoryService.getAllCategories();

        for (Category category : categories) {
            JButton categoryButton = new JButton(category.getName());
            buttonsPanel.add(categoryButton);

            categoryButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (category.getName().equals("Java Core")) {
                        // Получите записи из подкатегории JavaCore по ID категории
                        List<JavaCoreCat> javaCoreItems = javaCoreService.getJavaCoreItemsByCategoryId(category.getId());

                        // Отобразите новый фрейм с записями
                        new SubCategoryFrame(javaCoreItems);
                    }
                    else if (category.getName().equals("Spring")) {

                        List<SpringCat> springItems = springService.getSpringItemsByCategoryId(category.getId());

                        // Отобразите новый фрейм с записями
                        new SubCategoryFrame(springItems);
                    }
                }
            });
        }

        buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));

        setVisible(true);
    }
}