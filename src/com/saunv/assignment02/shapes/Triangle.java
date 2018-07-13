package com.saunv.assignment02.shapes;

public class Triangle extends TowDimensionalShape {
	private int a;
	private int b;
	private int c;

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public double getArea() {
		float p = (a + b + c) / 2;
		float S = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return S;
	}

	public String toString() {
		return showTypeOfShape() + "\nType: Triangle" + "\nLength edge a: " + a + " ,b: " + b + " ,c: " + c + "\nArea :"
				+ getArea();
	}

}
