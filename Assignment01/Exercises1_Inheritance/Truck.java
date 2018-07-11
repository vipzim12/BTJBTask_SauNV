package Exercises1_Inheritance;

public class Truck extends Car {

	private int weight;

	public Truck(int weight, int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public double getSalePrice() {
		if (weight > 2000) {
			return getRegularPrice() * 0.1;
		} else {
			return getRegularPrice() * 0.2;
		}

	}

	public String toString() {
		return "Card of informations:\nType: Truck" + "\nWeight: " + weight + "\nspeed: " + getSpeed() + "\nColor: "
				+ getColor() + "\nPrice: " + getRegularPrice() +"$"+ "\n--------------------------------------------";
	}
}
