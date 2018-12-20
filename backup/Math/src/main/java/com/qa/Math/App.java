package com.qa.Math;

import java.util.Scanner;

/**
 * Calculator- Exceptions Required 0.
 *
 */
public class App {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to the Calculator \nPlease Enter your first Value");
		Double int1= s.nextDouble();
		System.out.println("Please Enter your Iterator");
		String function= s.next();
		System.out.println("Please Enter your second Value");
		Double int2= s.nextDouble();
		s.close();
		System.out.println(calc(int1,function,int2));
		System.exit(0);

	}
		
		
		
	
	
	public static Double calc(Double int1,String function,Double int2) {
		if (function.equals("*"))
			return calcMul(int1,int2);
		
		else if(function.equals("+")) {
			return calcPlus(int1,int2);
		}
			
		else if (function.equals("-")) {
			return calcMin(int1,int2);
		}
			
		else if (function.equals("/")) {
			return calcDiv(int1,int2);
		}
			
		else{
			System.out.println("You Fail, Application Terminated");
			System.exit(0);
		
		}
		return 0.00;
		
	}

	public static Double calcPlus(Double int1, Double int2) {
		Double num1 = int1;
		Double num2 = int2;

		return num1 + num2;

	}

	public static Double calcMin(Double a, Double b) {
		Double num1 = a;
		Double num2 = b;

		return num1 - num2;

	}

	public static Double calcDiv(Double a, Double b) {
		Double num1 = a;
		Double num2 = b;

		return num1 / num2;
	}

	public static Double calcMul(Double a, Double b) {
		Double num1 = a;
		Double num2 = b;

		return num1 * num2;

	}
	
}
