package com.qa.project;

public class Person {

	private String jobTitle;
	private String name;
	private Integer age;

	public Person(String jobTitle, String name, Integer age) {
		this.jobTitle = jobTitle;
		this.name = name;
		this.age = age;
	}

	public Person() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAttributes() {
		return "Name: " + name + " Job Title: " + jobTitle + " Age: " + age;

	}

	public void setAttrubutes(String name, String jobTitle, Integer age) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
	}
	

	@Override
	public String toString() {
//		return getAttributes();
		return "Name: " + name + " Job Title: " + jobTitle + " Age: " + age;
	}
}