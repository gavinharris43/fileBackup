


import java.util.ArrayList;

import java.util.List;

public class PersonContainer{
	List<Person> list = new ArrayList<Person>();
	public void addPerson(String name,  Integer age, String jobTitle) {
		
		Person person = new Person();
		person.setAttrubutes(name, age, jobTitle);
		list.add(person);
		
	System.out.println(list);
		
	}

}

