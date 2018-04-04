package co.com.emer.java8.foreach;

import java.util.ArrayList;
import java.util.List;

public class GoThroughCollections {

	private List<String> names;

	public GoThroughCollections() {
		super();
		FillList();
	}
	
	public void useForEach(){
		/***
		 * < Java 1.8 for
		 
		for (String element : names){
			System.out.println(element);
		}
		*/
		
		/***
		 * = Java 1.8 forEach and lambda
		names.forEach(element -> System.out.println(element));
		*/
		
		/***
		 * = Java 1.8 forEach and Reference Method
		 */
		names.forEach(System.out::println);
	}
	
	public void userRemoveIf(){
		/***
		 * < Java 1.8 remove element 
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			if(it.next().equalsIgnoreCase("Emer")){
				it.remove();
			}
		}
		*/
		
		/**
		 * Java 1.8
		 */
		names.removeIf(x -> x.equalsIgnoreCase("Emer"));
	}
	
	
	public void userSort(){
		names.sort((x,y) -> x.compareTo(y));
	}
	
	private void FillList(){
		List<String> names = new ArrayList<String>();
		
		names.add("Emer");
		names.add("Ximena");
		names.add("Juan");
		names.add("Daniela");
		setNames(names);
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
	
	
}