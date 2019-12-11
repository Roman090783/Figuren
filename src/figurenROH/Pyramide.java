package figurenROH;

public abstract class Pyramide extends Figur3D {

	private double hoehe;
	private Figur2D grund;

	public Pyramide(double hoehe, Figur2D grund) {
		this.hoehe = hoehe;
		this.grund = grund;
	}

	public double mantel(){
		return oberflaeche() - grund.flaeche();
	}

	public double oberflaeche() {
		return grund.flaeche() + mantel();
	}
	
	//template Methode = Platzhalter fuer die noch nicht bekannte Berechnung
	//public abstract double mantel(); ?????????

	public double volumen() {
		
		return (1/3.0 )* this.getHoehe() * grund.flaeche() ;
	}


	public Figur2D getGrund() {
		return grund;
	}

	public void setGrund(Figur2D grund) {
		this.grund = grund;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	
}
