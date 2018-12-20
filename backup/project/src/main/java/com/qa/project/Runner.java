package com.qa.project;

//import java.util.stream.*;

public class Runner {
	public static void main(String[] args) {
		PersonContainer persons=new PersonContainer();
		persons.addPerson("Mr Green", "Junur Programmer",31);
		persons.addPerson("James", "Doctor",64);
		persons.addPerson("Gavin", "Programmer",22);
		System.out.println(PersonContainer.searchName("Gavin"));
		PersonContainer.prdouble();
	}

}
