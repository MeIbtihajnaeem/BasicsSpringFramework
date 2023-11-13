package com.javadev.springbootwebapp.Springbootwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean autheticate(String username, String password) {
		// equalsIgnoreCase ignore all the case and just compare string
		boolean isValidUsername = username.equalsIgnoreCase("ibtihaj");
		boolean isValidPassword = password.equalsIgnoreCase("123");
		return isValidPassword && isValidUsername;
	}
}
