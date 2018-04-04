package co.com.emer.java8.stream;

import java.util.ArrayList;
import java.util.List;

import co.com.emer.java8.stream.model.Spending;

public class Calculation {
	/*
	 * tenemos una lista de Spendings de viaje diarios y la empresa se hará cargo 
	 * de todos ellos. Eso sí , si una vez sumado a los Spendings el IVA el importe 
	 * supera los 100 euros la empresa no lo pagará ya que considerará que nos hemos 
	 * excedido en lo que gastamos en un día. 
	 * */
	
	public static void main(String[] args) {
		calculationJava8();
		
		calculationJava7();
	}
	
	public static void calculationJava8(){
		List<Spending> lista = new ArrayList<Spending>();
		//fill list
		lista.add(new Spending("A",10));
		lista.add(new Spending("B",60));
		lista.add(new Spending("C",70));
		lista.add(new Spending("D",50));
		lista.add(new Spending("E",100));
		
		double result = lista.stream()
				.mapToDouble(Spending -> Spending.getValue() * 1.21)
				.filter(Spending -> Spending < 100)
				.sum();
		System.out.println(result);
		
	}
	
	public static void calculationJava7(){
		List<Spending> lista = new ArrayList<Spending>();
		//fill list
		lista.add(new Spending("A",10));
		lista.add(new Spending("B",60));
		lista.add(new Spending("C",70));
		lista.add(new Spending("D",50));
		lista.add(new Spending("E",100));
		
		double paymentTotal = 0;
		for(Spending g : lista){
			if (g.getValue() * 1.21 < 100) {
				paymentTotal = paymentTotal + g.getValue() * 1.21;
			}
		}
		System.out.println(paymentTotal);
	}
}
