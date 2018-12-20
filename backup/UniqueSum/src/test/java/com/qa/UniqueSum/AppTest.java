package com.qa.UniqueSum;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest 
{
	@Test
	public void test1() {
		int result1=UniqueSum.input(10,11,12);
		
		assertEquals(33, result1);
	}
	@Test
	public void test2() {
		int result1=UniqueSum.input(3,3,3);
		
		assertEquals(0, result1);
	
	}
	@Test
	public void test3() {
		int result1=UniqueSum.input(1,1,3);
		
		assertEquals(3, result1);
	
	}
	@Test
	public void test4() {
		int result1=UniqueSum.input(10,11,11);
		
		assertEquals(10, result1);
	}
	@Test
	public void test5() {
		int result1=UniqueSum.input(3,11,3);
		
		assertEquals(11, result1);
	
	}
	@Test
	public void test6() {
		int result1=UniqueSum.input(0,0,0);
		
		assertEquals(0, result1);
	
	}
}
