package com.saunv.assignment01.exercises1_Inheritance;

public class Ford extends Car {
	private int year;
	private int manufacturerDiscount;

	public Ford(int year, int manafactureDiscount, int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manafactureDiscount;
	}

	@Override
	public double getSalePrice() {

		return this.getRegularPrice() - this.getRegularPrice() * manufacturerDiscount * 0.01;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}

	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}

	public String toString() {
		return "Card of informations: \nType: Ford" + "\nYear: " + year + "\nManufacturerer Discount: "
				+ manufacturerDiscount + "%" + "\nspeed: " + getSpeed() + "\nColor: " + getColor() + "\nPrice: "
				+ this.getRegularPrice() + "$" + "\n--------------------------------------------";
	}
}
