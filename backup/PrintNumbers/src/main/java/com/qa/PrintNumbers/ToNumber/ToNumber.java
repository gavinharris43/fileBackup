package com.qa.PrintNumbers.ToNumber;

/**
 * ToNumber
 *
 */
public class ToNumber {
	
	
	public static void toText(int n) {
	if (n < 0)
	{
		System.out.print("Negitive");
		 n=Math.abs(n);
	}
	else if (n == 0)
	{
		System.out.println("Zero");
	}
		ToNumber a = new ToNumber();
		a.toText(((n / 1000) % 100), " thousand");
		
		a.toText(((n / 100) % 10), " hundred");
		
		a.toText((n % 100), " ");
		System.out.println();
	}

	private void toText(int n, String ch) {
		String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
				" Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
				" Nineteen" };
 
		String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
 
		if (n > 19)
		{
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		}
		else
		{
			System.out.print(one[n]);
		}
		if (n > 0) 
			System.out.print(ch);
		
		

	}
}