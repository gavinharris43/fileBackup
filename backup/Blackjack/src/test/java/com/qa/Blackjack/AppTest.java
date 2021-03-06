package com.qa.Blackjack;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
	@Test
	public void testBlackjack1() {
		int result1 = Blackjack.BlackjackRun(12, 17);
		assertEquals(17, result1);
	}

	@Test
	public void testBlackjack2() {
		int result1 = Blackjack.BlackjackRun(12, 22);
		assertEquals(12, result1);
	}

	@Test
	public void testBlackjack3() {
		int result1 = Blackjack.BlackjackRun(23, 22);
		assertEquals(0, result1);
	}

	@Test
	public void testBlackjack4() {
		int result1 = Blackjack.BlackjackRun(21, 22);
		assertEquals(21, result1);
	}

	@Test
	public void testBlackjack5() {
		int result1 = Blackjack.BlackjackRun(21, 19);
		assertEquals(21, result1);
	}
	
	@Test
	public void testBlackjack6() {
		int result1 = Blackjack.BlackjackRun(19, 21);
		assertEquals(21, result1);
	}

	@Test
	public void testBlackjack7() {
		int result1 = Blackjack.BlackjackRun(21, 21);
		assertEquals(21, result1);
	}
}