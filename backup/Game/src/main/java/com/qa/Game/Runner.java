package com.qa.Game;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Runner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		System.out.println("Enter Name?");
		String doublero = sc.nextLine();
		System.out.println(game.doublero(doublero));
		game.start();
		game.tresure();
		game.alergyInfo();
		String input = sc.nextLine();
		System.out.println("You have chosen " + game.alergySet(input));
		game.foundTresure();
	}
}