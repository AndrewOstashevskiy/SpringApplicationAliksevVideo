package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import ru.javabegin.training.spring.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

		ModelT1000 t1000 = (ModelT1000) context.getBean("model1");
		ModelT1000 t10001 = (ModelT1000) context.getBean("model2");
		t1000.action();
		System.out.println();
		t10001.action();


		context.close();

	}
}
