package pkgMain;

import java.math.*;
/**
 * Creates a Triangle given its three sides.
 * Calculates the Area and the Perimeter of the Triangle.
 * @author skothare
 *
 */
public class Triangle extends GeometricObject{

	private double side1;
	private double side2;
	private double side3;
	
	// A no-argument constructor to create a default triangle.
	public Triangle(){
		side1 = 0.0;
		side2 = 0.0;
		side3 = 0.0;
	}
	
	// Accessor methods for all three data fields.
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
 
	/**
	 * A constructor which creates a triangle as per the given parameters.
	 * @param a Side 1 of the Triangle
	 * @param b Side 2 of the Triangle
	 * @param c Side 3 of the Triangle
	 * @throws InvalidTriangleException
	 * Throws this exception to in the event of an invalid imaginary triangle is created.
	 */
	public Triangle(double a, double b, double c) throws InvalidTriangleException{
		double scheck = (a + b + c)/2;
		double underroot = scheck*(scheck-a)*(scheck-b)*(scheck-c);
		if (underroot > 0){
			this.side1 = a;
			this.side2 = b;
			this.side3 = c;
		}
		else{
			throw new InvalidTriangleException(underroot);
		}
	}
	
	/*getArea method which overrides this abstract method in GeometricObject.
	Calculates and returns the area of the Triangle.*/
	@Override
	public double getArea() {
		double s = (side1 + side2 + side3)/2;
		double AreaTriangle = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return AreaTriangle;
	}
	
	/*getPerimeter method which overrides this abstract method in GeometricObject.
	Calculates and returns the perimeter of the Triangle.*/
	@Override
	public double getPerimeter() {
		double PerimeterTriangle = side1 + side2 + side3;
		return PerimeterTriangle;
	}
	
	//Returns a String description of the triangle.
	public String toString() {
		return ("First side of the triangle " + this.side1 + ","
				+ "Second side of the triangle " + this.side2 + ","
				+ "Third side of the triangle " + this.side3 + ".");
	}
	
	

}
