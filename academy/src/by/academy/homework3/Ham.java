package by.academy.homework3;

import java.util.Objects;

public class Ham extends Product {

	private double weight;
	private double years;
	
	public Ham() {
		super();
	}

	public Ham(String name, double price, int quantity, double weight, double years) {
		super(name, price, quantity);
		this.weight = weight;
		this.years = years;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getYears() {
		return years;
	}

	public void setYears(double years) {
		this.years = years;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(weight, years);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ham other = (Ham) obj;
		return Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight)
				&& Double.doubleToLongBits(years) == Double.doubleToLongBits(other.years);
	}

	@Override
	public String toString() {
		return "Ham [weight=" + weight + ", years=" + years + "]";
	}

	@Override
	protected double discount() {
		if (years >= 2) {
			return 0.3;
		}
		return 0;
	}

}
