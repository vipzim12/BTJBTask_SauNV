package com.saunv.assignment02.shapes;

public class Cube extends ThreeDimensionalShape {
	private int a;

	public Cube(int a) {
		super();
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getArea() {

		return 6 * a * a;
	}

	@Override
	public float getVolume() {

		return a * a * a;
	}

	public String toString() {
		return showTypeOfShape() + "\nType: Cube" + "\nEdge: " + a + "\nArea :" + getArea() + "\nVolume: "
				+ getVolume();
	}
}
