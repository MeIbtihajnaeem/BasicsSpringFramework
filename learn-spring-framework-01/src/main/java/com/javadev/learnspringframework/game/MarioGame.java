package com.javadev.learnspringframework.game;

public record MarioGame() implements GamingConsole {

	public void up() {

		System.out.println("MarioGame UP");

	}

	public void down() {

		System.out.println("MarioGame Down");

	}

	public void left() {

		System.out.println("MarioGame Left");

	}

	public void right() {

		System.out.println("MarioGame Right");

	}

	public void marioGame() {
		System.out.println("I am super mario");

	}

}
