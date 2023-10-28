package com.javadev.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javadev.learnspringframework.game.GameRunner;
import com.javadev.learnspringframework.game.GamingConfiguration;
import com.javadev.learnspringframework.game.GamingConsole;
import com.javadev.learnspringframework.game.MarioGame;
import com.javadev.learnspringframework.game.Pacman;
import com.javadev.learnspringframework.game.SuperContra;

public class AppGamingBasicSpring {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();

			context.getBean(Pacman.class).pacman();

			context.getBean(MarioGame.class).marioGame();

			context.getBean(SuperContra.class).superContra();
		}

	}

}
