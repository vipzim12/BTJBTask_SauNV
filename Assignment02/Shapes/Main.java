package Shapes;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Shape> mShape = new ArrayList<>();
		Shape cricle = new Cricle(5);
		Shape triangle = new Triangle(3, 4, 5);
		Shape square = new Square(10);
		Shape cube = new Cube(15);
		Shape sphere = new Sphere(7);
		Shape tetrahedron = new Tetrahedron(new Point(1, 2, 3), new Point(-4, 4, 1), new Point(1, 3, 2),
				new Point(1, 5, -2));
		mShape.add(cricle);
		mShape.add(triangle);
		mShape.add(square);
		mShape.add(tetrahedron);
		mShape.add(cube);
		mShape.add(sphere);
		System.out.println("------------Shapes Infomation--------------");
		for (int i = 0; i < mShape.size(); i++) {
			System.out.println(mShape.get(i).toString());
			System.out.println("-----------------o0o---------------");
		}

	}

}
