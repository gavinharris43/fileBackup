package com.qa.SentenceReduction;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void test1() {
		String reduction = App.reduction("live verses");
		
		assertEquals("liverses", reduction);
	}
	@Test
	public void test2() {
		String reduction = App.reduction("I heard the pastor sing live verses easily.");
		
		assertEquals("I heard the pastor sing liverses easily.", reduction);
	}
	@Test
	public void test3(){
		String reduction = App.reduction("Deep episodes of Deep Space Nine came on the television only after the news.\r\n" + 
				"Digital alarm clocks scare area children.");
		
		assertEquals("Deepisodes of Deep Space Nine came on the televisionly after the news.\r\n" + 
				"Digitalarm clockscarea children.", reduction);
	}
	@Test
	public void test4(){
		String reduction = App.reduction("clocks scare area");
		
		assertEquals("clockscarea", reduction);
	}
}
