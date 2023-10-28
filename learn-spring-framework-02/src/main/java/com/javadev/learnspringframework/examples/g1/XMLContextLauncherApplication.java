package com.javadev.learnspringframework.examples.g1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class XMLContextLauncherApplication {
	public static void main(String[] args) {
		try (var context = new ClassPathXmlApplicationContext("config.xml")) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			
		}
	}
}