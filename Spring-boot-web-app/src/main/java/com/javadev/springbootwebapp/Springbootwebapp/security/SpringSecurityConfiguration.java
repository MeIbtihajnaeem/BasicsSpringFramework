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
		Function<String, String> passwordEncoder = input -> 
		passwordEncoder1().encode(input);
		UserDetails userDetails =
				User.builder().passwordEncoder(passwordEncoder).
				username("ibtihaj").password("123")
				.roles("User", "Admin").build();
		return new InMemoryUserDetailsManager(userDetails);
	}

	@Bean
	public PasswordEncoder passwordEncoder1() {
		return new BCryptPasswordEncoder();
	}
	
	

}
