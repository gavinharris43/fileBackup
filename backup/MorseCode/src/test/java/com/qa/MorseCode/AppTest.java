package com.qa.MorseCode;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void test1() {
		Translate mc = new Translate();
		String input = mc.toEnglish(".-");//.---.
		assertEquals("a", input.toString());
	}
	@Test
	public void test2() {
		Translate mc = new Translate();
		String input = mc.toEnglish(".... . .-.. .-.. ---");//.---.
		assertEquals("hello", input.toString());
	}
	@Test
	public void test3() {
		Translate mc = new Translate();
		String input = mc.toEnglish(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--");//.---.
		assertEquals("hello daily programmer good luck on the challenges today", input.toString());
	}
}
