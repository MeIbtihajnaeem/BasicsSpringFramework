package com.javadev.learnspringframework.game;

public record Pacman() implements GamingConsole {
	public void up() {

		System.out.println("Pacman UP");

	}

	public void down() {

		System.out.println("Pacman Down");

	}

	public void left() {

		System.out.println("Pacman Left");

	}

	public void right() {

		System.out.println("Pacman Right");

	}

	public void pacman() {
		System.out.println("I am Pacman");

	}

}
