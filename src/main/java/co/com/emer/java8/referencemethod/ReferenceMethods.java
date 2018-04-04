package co.com.emer.java8.referencemethod;

import java.util.Arrays;

import co.com.emer.java8.stream.model.Person;

public class ReferenceMethods {

	public static void main(String[] args) {
		//First Method
		ReferenceMethods referenceMethod = new ReferenceMethods();
		referenceMethod.greet();
		
		referenceMethod.referenceInstanceMethodArbitraryObject();
		
		Greeting greeting = referenceMethod::referenceInstanceMethodParticularObject;
		greeting.greet();
		
		referenceMethod.referenceConstuctor();
	}
	
	private void greet(){
		/*Greeting greeting = () -> ReferenceMethods.referenceStaticMethod();
		greeting.greet();*/
		
		//This is a Reference Method
		Greeting greeting = ReferenceMethods::referenceStaticMethod;
		greeting.greet();
	}
	
	private static void referenceStaticMethod(){
		System.out.println("Método estatico Referido");
	}
	
	private void referenceInstanceMethodArbitraryObject(){
		String[] names = {"Emerson" , "Camila" , "Ximana"};
		/***
		 * Java 7
		Arrays.sort(names, new Comparator<String>(){
			@Override
			public int compare(String ol, String o2){
				return ol.compareToIgnoreCase(o2);
			}
		});*/
		
		/***
		 * Lambda Java 8
		 * 
		 Arrays.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));
		 */
		
		/***
		 * Java 8 Reference Method
		 */
		
		Arrays.sort(names, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(names));
	}

	private void referenceInstanceMethodParticularObject(){
		System.out.println("Metodo referido instancia de un Objeto en particular");
	}

	private void referenceConstuctor(){
		/***
		 * < Java 1.8		 
		IPerson person = new IPerson(){

			@Override
			public Person create(int id, String name, String lastName) {
				return new Person(id, name, lastName);
			}
		};
		
		person.create(1, "Emer", "Gonzalez");
		*/
		
		/***
		 * = Java 1.8 Lambdas
		 */
		
		/*
		IPerson person = (id, name, lastName) -> (new Person(id, name, lastName));
		Person per = person.create(1, "Emer", "Gonzalez");
		System.out.println(per.getId() + " - " + per.getName() + " - " + per.getLastName());*/
		
		/***
		 * = Java 1.8 Reference Method
		 */
		IPerson person = Person::new;
		Person per = person.create(1, "Emer", "Gonzalez");
		System.out.println(per.getId() + " - " + per.getName() + " - " + per.getLastName());
		
	}
}
