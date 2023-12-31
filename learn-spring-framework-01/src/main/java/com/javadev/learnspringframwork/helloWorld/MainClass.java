package com.javadev.learnspringframwork.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Launch a Spring context
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			// 2. Configure the things that we want Spring to manage-
			// HelloWorldConfiguration - @Configuration

			// Retrieving Beans managed by Spring

			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean(String.class));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean("person5Qualifier"));

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}

}
