package figurenROH;

public abstract  class GeradesPrisma extends Figur3D {

	private final Figur2D grundFlaeche;
	private double hoehe;

	public GeradesPrisma(double hoehe, Figur2D grund) {
		this.hoehe = hoehe;
		this.grundFlaeche = grund;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	
	public double oberflaeche() {
		double o = 2 * grundFlaeche.flaeche() + grundFlaeche.umfang() * this.getHoehe();
		return  o;
	}

	public double volumen() {
		
		return this.getHoehe() * grundFlaeche.flaeche() ;
	}
}
