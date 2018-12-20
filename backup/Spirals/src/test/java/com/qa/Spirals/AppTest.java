package com.qa.Spirals;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Assert;

public class AppTest

{
	Spirals spiral = new Spirals();
@Test
public void test() {
	int[][] array =spiral.run(5);
	int[][] input= array;
	int[][] out= {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,10,9}};
	
	
	Assert.assertArrayEquals(4,input);
	
	
}



}
