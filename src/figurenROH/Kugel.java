package figurenROH;

public class Kugel extends Figur3D {
	private double radius;
	
	public Kugel(double radius) {
		super();
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double oberflaeche() {

		return 4 * Math.PI * Math.pow(radius, 2);
	}
	public double volumen() {

		return 4/3 * Math.PI * Math.pow(radius, 3);
	}

}
