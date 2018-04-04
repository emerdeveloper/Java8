package co.com.emer.java8.finterface;

public class ImplementationFuntionalInterface {
	
	public static void main(String[] args) {
		ImplementationFuntionalInterface m = new ImplementationFuntionalInterface();
		
		Operation addition  = (n1,n2) -> n1 + n2;
		Operation subtraction = (double n1, double n2) -> { return n1 - n2; };
		Operation multiplication = (n1, n2) -> { return n1 * n2; };
		
		System.out.println("5 + 5 = " + m.operate(5.0, 5.0, addition));
		System.out.println("6 - 2 = " + m.operate(6, 2, subtraction));
		System.out.println("3 * 3 = " + m.operate(3, 3, multiplication));
	}
	
	public double operate(double n1, double n2, Operation o){
		return o.operation(n1, n2);	
	}
}
