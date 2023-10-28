package com.javadev.learnspringframework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Prototype {

}

@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class)) {

			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));

			System.out.println(context.getBean(Prototype.class));
			System.out.println(context.getBean(Prototype.class));
			System.out.println(context.getBean(Prototype.class));
		}
	}
}