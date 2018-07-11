package Shapes;

public class Sphere extends ThreeDimensionalShape {
	private int r;

	public Sphere(int r) {
		super();
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public double getArea() {
		return 4 * Math.PI * r * r;

	}

	@Override
	public float getVolume() {

		return (float) (4 / 3 * Math.PI * r * r * r);
	}

	public String toString() {
		return showTypeOfShape() + "\nType: Sphere" + "\nadius: " + r + "\nArea :" + getArea() + "\nVolume: "
				+ getVolume();
	}
}
