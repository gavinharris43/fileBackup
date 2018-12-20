package com.qa.Taxes;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaxTest 
{
	@Test
	public void test1Method1() {
		double result1= Taxes.method1(4000);
		assertEquals(0,result1,0);
	}
	@Test
	public void test2Method1() {
		double result1= Taxes.method1(40000);
		assertEquals(20,result1,0);
	}
	@Test
	public void test3Method1() {
		double result1= Taxes.method1(19999);
		assertEquals(10,result1,0);
	}
	@Test
	public void test4Method1() {
		double result1= Taxes.method1(1000000000);
		assertEquals(25,result1,0);
	}
	@Test
	public void test5Method1() {
		double result1= Taxes.method1(21000);
		assertEquals(15,result1,0);
	}
	@Test
	public void test6Method1() {
		double result1= Taxes.method1(14999);
		assertEquals(0,result1,0);
	}
	@Test
	public void test1Method2() {
		double result1= Taxes.method2(14999);
		assertEquals(0,result1, 0);
	}
	@Test
	public void test2Method2() {
		double result1= Taxes.method2(24999);
		assertEquals(3749.85,result1, 0);
	}
	@Test
	public void test3Method2() {
		double result1= Taxes.method2(30000);
		assertEquals(6000,result1, 0);
	}
	@Test
	public void test4Method2() {
		double result1= Taxes.method2(0);
		assertEquals(0,result1, 0);
	}
	@Test
	public void test5Method2() {
		double result1= Taxes.method2(45001);
		assertEquals(11250.25,result1, 0);
	}
	@Test
	public void test6Method2() {
		double result1= Taxes.method2(110256.33);
		assertEquals(27564.08,result1, 1);
	}
}
