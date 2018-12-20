package com.qa.Collections;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        toArray1To100();
        toArray100To999();
        toArray100To999X10();
    }


private static void toArray1To100(){
	ArrayList<Object> oneToHundred = new ArrayList<>();

	for(int i=1;i<=100;i++) {
		oneToHundred.add(i);
		
	}
	System.out.println(oneToHundred);
}
private static void toArray100To999(){
	ArrayList<Object> oneHundredToTho = new ArrayList<>();

	for(int i=100;i<=999;i++) {
		oneHundredToTho.add(i);
		
	}
	System.out.println(oneHundredToTho);
}
private static void toArray100To999X10(){
	ArrayList<Object> oneHundredToThoX10 = new ArrayList<>();
	for(int i=100;i<=999;i++) {
		oneHundredToThoX10.add(i*10);
		
	}
	System.out.println(oneHundredToThoX10);
}
	
}
