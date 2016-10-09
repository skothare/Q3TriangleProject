package pkgTst;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pkgMain.InvalidTriangleException;
import pkgMain.Triangle;
import java.math.*;
/**
 * Consists of JUnit Tests for Triangles created and their area and perimeter calculations.
 * @author skothare
 *
 */
public class TriangleTest{
	
	/**
	 * Tests for an imaginary triangle, that is, when the sum of two sides is 
	 * not greater than the other.
	 * @throws InvalidTriangleException
	 */
	@Test(expected = InvalidTriangleException.class)
	public final void testInvalidTriangle1() throws InvalidTriangleException{
		Triangle t1 = new Triangle(4, 0, 5);
		fail("Expected a InvalidTriangleException to be thrown");
	}
	/**
	 * Tests for an imaginary triangle, that is, when the sum of all sides is 0.
	 * @throws InvalidTriangleException
	 */
	@Test(expected = InvalidTriangleException.class)
	public final void testInvalidTriangle2() throws InvalidTriangleException{
		Triangle t2 = new Triangle(0 , 0 , 0);
		fail("Expected a InvalidTriangleException to be thrown");
	}
	
	/**
	 * Tests the Triangle's area calculations
	 * @throws InvalidTriangleException
	 */
	@Test
	public final void testAreaTriangle() throws InvalidTriangleException{
		Triangle t3 = new Triangle(0.5, 1.2, 1.5);
		assertTrue(Math.floor(t3.getArea()) == Math.floor((2/25)*Math.sqrt(11.0)));
		Triangle t4 = new Triangle(10, 10, 10);
		assertTrue(t4.getArea() == 25 * Math.sqrt(3.0));
	}
	/**
	 * Tests the Triangle's area calculations
	 * @throws InvalidTriangleException
	 */
	@Test
	public final void testPerimeterTriangle() throws InvalidTriangleException{
		Triangle t5 = new Triangle(3, 4, 5);
		assertTrue(t5.getPerimeter() == 12);
		Triangle t6 = new Triangle(2, 3, 4);
	}
}
