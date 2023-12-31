package com.javadev.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	SomeDependecy dependency;

	public SomeClass(SomeDependecy dependency) {
		this.dependency = dependency;
		System.out.println("All Dependencies ready");
	}

	@PostConstruct
	public void initilize() {
		dependency.getReady();
	}

	@PreDestroy
	public void clean() {
		System.out.println("Clean");
	}
}

@Component
class SomeDependecy {

	public void getReady() {
		System.out.println("I am ready");
	}
}

@Configuration
@ComponentScan
public class PrePostLauncherApplication {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(PrePostLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}