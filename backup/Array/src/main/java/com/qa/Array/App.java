package com.qa.Array;

import java.util.ArrayList;

// import java.util.IntSummaryStatistics;
//import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		int[] arraylist = { 2, 1, 5, 8, 5, 3, 12, 4 };

		for (int array : arraylist) {
			System.out.println(array);
		}
		for (int array : arraylist) {
			if (array % 2 == 0) {
				System.out.println(array);
			}

		}
		for (int array : arraylist) {
			if (array % 2 != 0) {
				System.out.println(array);
			}

		}
		int min = Integer.MAX_VALUE;

		for (int array : arraylist) {

			if (array < min) {
				min = array;

			}

		}
		System.out.println("min "+ min);
		
		int max = Integer.MIN_VALUE;

		for (int array : arraylist) {

			if (array > max) {
				max = array;

			}

		}
		System.out.println("max "+ max);
		
		for (int array : arraylist) {
			System.out.println(array*5);
			
		}
		ArrayList<Object> objects = new ArrayList<>();
		for (int array : arraylist) {
			if (array % 2 == 0) {
				objects.add(array);
				
			}
			
		}System.out.println(objects);
		/*
		 * Simple Way
		 * 
		 * IntSummaryStatistics stat = Arrays.stream(arraylist).summaryStatistics(); int
		 * min = stat.getMin(); int max = stat.getMax(); System.out.println("Min = " +
		 * min); System.out.println("Max = " + max);
		 */
		// System.out.println(Arrays.stream(arraylist).summaryStatistics());
		
		
	}
}
