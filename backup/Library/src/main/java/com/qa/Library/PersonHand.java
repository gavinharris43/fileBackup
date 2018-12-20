package com.qa.Library;

import java.util.ArrayList;
import java.util.List;

public class PersonHand {
	private List <Person> people= new ArrayList<Person>();
	public Library man = new Library("Manchester");
	
	
	
	public PersonHand() {
		
	}
	public Person addToList(String name){
		Person person=man.addPerson(name);
		people.add(person);
		
		return person;
		
		
	}
	

}
