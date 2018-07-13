package com.saunv.assignment02.shapes;

public class Square extends TowDimensionalShape {
	private int a;

	public Square(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getArea() {
		return a * a;

	}

	public String toString() {
		return showTypeOfShape() + "\nType: Square" + "\nEdge: " + a + "\nArea :" + getArea();
	}
}
