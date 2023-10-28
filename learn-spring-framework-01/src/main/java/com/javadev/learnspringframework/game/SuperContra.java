package com.javadev.learnspringframework.game;

public record SuperContra() implements GamingConsole {
	public void up() {

		System.out.println("SuperContra UP");

	}

	public void down() {

		System.out.println("SuperContra Down");

	}

	public void left() {

		System.out.println("SuperContra Left");

	}

	public void right() {

		System.out.println("SuperContra Right");

	}

	public void superContra() {
		System.out.println("I am Super Contra");

	}

}
