package co.com.emer.java8.referencemethod;

import co.com.emer.java8.stream.model.Person;

@FunctionalInterface
public interface IPerson {

	Person create(int id, String name, String lastName);
}
