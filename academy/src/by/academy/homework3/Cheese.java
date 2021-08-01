package by.academy.homework3;

import java.util.Objects;

public class Cheese extends Product {
	private double weight;
	private String color;

	public Cheese() {
		super();
	}

	public Cheese(String name, double price, int quantity, double weight, String color) {
		super(name, price, quantity);
		this.weight = weight;
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color, weight);
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
		Cheese other = (Cheese) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cheese [weight=");
		builder.append(weight);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}

	@Override
	protected double discount() {
		if (weight >= 1) {
			return 0.5; 
		}
		return 0;
	}
}
