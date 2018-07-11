package Exercises1_Inheritance;

import java.util.ArrayList;
import java.util.HashSet;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Car sedan = new Sedan(10, 100, 1000, "Red");
		Car truck = new Truck(3000, 150, 2000, "Yelow");
		Car ford = new Ford(2010, 10, 190, 2030, "Green");
		ArrayList<Car> mCar = new ArrayList<>();
		mCar.add(sedan);
		mCar.add(ford);
		mCar.add(truck);
		System.out.println("-------Car of informations--------");
		for (int i = 0; i < mCar.size(); i++) {
			System.out.println("Car " + (i + 1) + ": " + mCar.get(i).toString());
		}
	}

}
