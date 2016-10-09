package pkgMain;
/**
 * Defines an InvalidTriangle Exception to check for an imaginary or a zero triangle.
 * @author skothare
 *
 */
public class InvalidTriangleException extends Exception {
	
	private double root;
	
	public InvalidTriangleException(double root){
		this.root = root;
	}

	public double getRoot() {
		return root;
	}
	

}
