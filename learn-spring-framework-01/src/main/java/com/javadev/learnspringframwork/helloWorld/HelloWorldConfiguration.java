package com.javadev.learnspringframwork.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {

}

record Address(String firstLine, String city) {

}

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Ranga";
	}

	@Bean
	public int age() {
		return 12;
	}

	@Bean
	Person person() {
		var person = new Person("Ibtihaj", 22, new Address("hardcode street", "hardcode city"));
		person.age();
		person.name();
		return person;
	}

	@Bean
	Person person2MethodCall() {
		return new Person(name(), age(), address());

	}

	@Bean
	Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);

	}
	

	@Bean
	@Primary
	Person person4Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);

	}

	
	@Bean
	Person person5Qualifier(String name, int age,	@Qualifier("address2Qualifier") Address address3) {
		return new Person(name, age, address3);

	}
	
	
	@Qualifier("address2Qualifier")
	@Bean(name = "address2")
	Address address() {
		return new Address("BACKERS STREET", "LONDON");
	}

	@Primary
	@Bean(name = "address3")
	Address address3() {
		return new Address("11st street", "LONDON");
	}




}
