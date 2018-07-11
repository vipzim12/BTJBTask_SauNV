package Shapes;

public abstract class ThreeDimensionalShape implements Shape {

	public String showTypeOfShape(){
		return "This is Three Dimensional Shape.";
	}
	public abstract float getVolume();
}
