package co.com.emer.java8.stream.model;

public class Spending {
	private String spending;
	private double value;

	public Spending(String spending, double value) {
		this.spending = spending;
		this.value = value;
	}

	public void setSpending(String spending) {
		this.spending = spending;
	}

	public String getSpending() {
		return spending;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}
