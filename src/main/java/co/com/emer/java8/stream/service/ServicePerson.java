package co.com.emer.java8.stream.service;

import java.util.ArrayList;
import java.util.List;

import co.com.emer.java8.stream.model.Person;

public class ServicePerson extends Person {

	public List<Person> fillList(){
		List<Person> list = new ArrayList<Person>();		
		for (int i = 0; i < 100; i++) {
			list.add(i, new Person(1, "nia"+i, "martin"+i));
		}
		list.add(new Person(101,"Mario", "Monrroy"));
		return list;
	}
}
