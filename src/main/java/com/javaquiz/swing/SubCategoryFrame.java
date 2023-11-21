package com.javaquiz.swing;

import com.javaquiz.entity.subitem.SubCategoryItem;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SubCategoryFrame<T extends SubCategoryItem> extends JFrame {

    

    public SubCategoryFrame(List<T> items) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1200, 800);

        JPanel buttonsPanel = new JPanel();
        add(buttonsPanel);

        for (SubCategoryItem item : items) {
            JButton button = new JButton(item.getName());
            buttonsPanel.add(button);
            // Добавьте обработчик событий для кнопки, если необходимо
        }

        buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));

        setVisible(true);
    }
}
