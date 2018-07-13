package com.saunv.assignment02.shapes;

public class Cricle extends TowDimensionalShape {
	private int r;

	public Cricle(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public double getArea() {
		return Math.PI * r * r;
	}

	public String toString() {
		return showTypeOfShape() + "\nType: Cricle" + "\nRadius: " + r + "\nArea :" + getArea();
	}
}
