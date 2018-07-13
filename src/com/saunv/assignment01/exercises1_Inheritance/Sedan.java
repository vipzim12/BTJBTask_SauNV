package com.saunv.assignment01.exercises1_Inheritance;

public class Sedan extends Car {
	private int length;

	public Sedan(int length, int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	@Override
	public double getSalePrice() {
		if (length > 20) {
			return getRegularPrice() * 0.05;
		} else {
			return getRegularPrice() * 0.1;
		}
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String toString() {
		return "Card of informations:\nType: Sedan" + "\nLength: " + length +" feet"+ "\nspeed: " + getSpeed() + "\nColor: "
				+ getColor() + "\nPrice: " + getRegularPrice() +"$"+ "\n--------------------------------------------";
	}
}
