package com.javaquiz;

import com.javaquiz.swing.FirstPage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class JavaQuiz1Application extends JFrame {

	public static void main(String[] args) {
		// SpringApplication.run(JavaQuiz1Application.class, args);

		ConfigurableApplicationContext context = new SpringApplicationBuilder(JavaQuiz1Application.class).headless(false).run(args);


		EventQueue.invokeLater(() -> {
			FirstPage ex = context.getBean(FirstPage.class);
		});
	}

}
