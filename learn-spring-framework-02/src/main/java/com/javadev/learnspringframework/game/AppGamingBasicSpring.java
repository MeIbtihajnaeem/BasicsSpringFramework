package com.javadev.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.javadev.learnspringframework.game")
public class AppGamingBasicSpring {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(AppGamingBasicSpring.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}