package com.javadev.springbootwebapp.Springbootwebapp.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {

		UserDetails userDetails = createNewUser("ibtihaj", "123");
		UserDetails userDetails1 = createNewUser("naeem", "1234");
		return new InMemoryUserDetailsManager(userDetails,userDetails1);
	}

	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder = input -> passwordEncoder1().encode(input);
		UserDetails userDetails = User.builder().passwordEncoder(passwordEncoder).username(username).password(password)
				.roles("User", "Admin").build();
		return userDetails;
	}

	@Bean
	public PasswordEncoder passwordEncoder1() {
		return new BCryptPasswordEncoder();
	}

}
