package com.qa.PrintNumbers;

import com.qa.PrintNumbers.ToNumber.ToNumber;

/**
 * Main
 *
 */
public class App {
	public static void main(String[] args) {
		oneToTen();
		oneToTenText();
		n100To999();
		text1To100();
		text1To1000();

	}

	private static void oneToTen() {
		for (int i = 1; i <= 10; i++) {

			System.out.println(i);

		}
	}

	private static void oneToTenText() {
		for (int i = 1; i <= 10; i++) {
			ToNumber.toText(i);
		}
	}

	private static void text1To1000() {
		for (int i = 1; i <= 1000; i++) {
			ToNumber.toText(i);
		}
	}
	private static void text1To100() {
		for (int i = 1; i <= 100; i++) {
			ToNumber.toText(i);
		}
	}
	private static void n100To999() {

		for (int i = 100; i <= 999; i++) {

			System.out.println(i);

		}

	}
}
