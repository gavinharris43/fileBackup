package com.qa.Library;

import java.sql.Array;

public class Person {
	private static int personID;
	private String name;
	private boolean isRegistered;
	private Array itemsCheckedOut;

	public Person(String name) {
		personID++;
		this.name=name;
		this.isRegistered=false;
		this.itemsCheckedOut=null;
		// TODO Auto-generated constructor stub
	}

	public int getPersonID() {
		return personID;
	}
	

	public static void setPersonID(int personID) {
		Person.personID = personID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public Array getitemsCheckedOut() {
		return itemsCheckedOut;
	}

	public void setitemsCheckedOut(Array itemsCheckedOut) {
		this.itemsCheckedOut = itemsCheckedOut;
	}

	@Override
	public String toString() {
		return "Person [ID="+getPersonID()+", name=" + name + ", isRegistered=" + isRegistered + ", itemsCheckedOut=" + itemsCheckedOut + "]";
	}
	

}
