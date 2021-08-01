package by.academy.homework3;

import java.util.Objects;

public class Milk extends Product {

	private double fatcon;
	private double volume;

	public Milk() {
		super();
	}

	public Milk(String name, double price, int quantity, double fatcon, double volume) {
		super(name, price, quantity);
		this.fatcon = fatcon;
		this.volume = volume;
	}

	public double getFatcon() {
		return fatcon;
	}

	public void setFatcon(double fatcon) {
		this.fatcon = fatcon;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(fatcon, volume);
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
		Milk other = (Milk) obj;
		return Double.doubleToLongBits(fatcon) == Double.doubleToLongBits(other.fatcon)
				&& Double.doubleToLongBits(volume) == Double.doubleToLongBits(other.volume);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Milk [fatcon=");
		builder.append(fatcon);
		builder.append(", volume=");
		builder.append(volume);
		builder.append("]");
		return builder.toString();
	}

	@Override
	protected double discount() {
		if (fatcon <= 1.5) {
			return 0.25; 
		}
		return 0;
	}

}
