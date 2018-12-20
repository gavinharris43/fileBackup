package com.qa.CheckString;
import java.util.Scanner;

/**
 * CheckString
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Guess the password: ");
    	String a = s.next();
    	
        System.out.println("Is " + a + " Equal? " + check(a));
        
        s.close();

    }
    public static boolean check(String a) {
    	 
    	if (a.equals("hello")) {
    		
    		return true;
    	}else{
    		return false;
    	}
    		

    	}
    	
	}

