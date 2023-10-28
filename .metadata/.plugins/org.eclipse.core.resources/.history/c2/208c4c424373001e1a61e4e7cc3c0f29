package com.javadev.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

	@Bean
	@Primary
//	@Qualifier("mainGameQualifier")
	public GamingConsole game() {
		var game = new Pacman();
		return game;
	}

	@Qualifier("PacmanQualifier")
	@Bean
	public GamingConsole packman() {
		var game = new Pacman();
		return game;
	}

	@Qualifier("MarioQualifier")
	@Bean
	public GamingConsole mario() {
		var game = new MarioGame();
		return game;
	}

	@Qualifier("ContraQualifier")
	@Bean
	public GamingConsole contra() {
		var game = new SuperContra();
		return game;
	}

	@Bean
	@Primary
	public GameRunner gameRunner(GamingConsole game) {
		var runner = new GameRunner(game);
		return runner;
	}


}
