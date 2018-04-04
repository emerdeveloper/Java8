package co.com.emer.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import co.com.emer.java8.stream.model.Person;
import co.com.emer.java8.stream.service.ServicePerson;

public class Streams {

	static List<Person> people;

	public static void main(String[] args) {
		showPowerStreams();
	}

	private static void showPowerStreams() {
		ServicePerson sp = new ServicePerson();
		people = new ArrayList<Person>();

		people = sp.fillList();

		filterList();
		transform();

		// hacer una lista de los nombres del objeto
		System.out.println(people.stream().map(Person::getName).collect(Collectors.toList()));
		// filtrando nombres por el 3 digito sea igual a 3
		System.out.println("filtro por 5: " + people.stream().map(Person::getName)
				.filter(digit -> digit.charAt(3) == '5').collect(Collectors.toList()));

		
	}

	private static void filterList() {
		System.out.println("::::::::Use Filter::::::::");
		people.stream().map(Person::getName).filter(x -> x.startsWith("M")).forEach(System.out::println);

		// Collectors
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(":::::::::Filtered List: \n" + filtered);
		
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("::::::::Merged String: \n" + mergedString);
	}
	
	private static void transform(){
		System.out.println("\n"
				+ "::::::::::::::::Transform One");
		List<String> collected = Stream.of("q", "a", "w").map(string -> string.toUpperCase()).collect(Collectors.toList());
		System.out.println(collected);
		System.out.println(":::::Transform Trwo");
		collected.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
