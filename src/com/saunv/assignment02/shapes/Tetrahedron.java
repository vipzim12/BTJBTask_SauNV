package com.saunv.assignment02.shapes;

public class Tetrahedron extends ThreeDimensionalShape {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;

	public Tetrahedron(Point pointA, Point pointB, Point pointC, Point pointD) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public float getVolume() {

		return 0;
	}

	public String toString() {
		return showTypeOfShape() + "\nType: Tetrahedron" + "\nPoint A" + getPointA().toString() + "  B"
				+ getPointB().toString() + "  C" + getPointC().toString() + "  D" + getPointD().toString() + "\nArea :"
				+ getArea() + "\nVolume: " + getVolume();
	}

}
