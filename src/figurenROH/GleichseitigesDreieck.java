package figurenROH;

public class GleichseitigesDreieck extends Dreieck {

	private double seitenLaenge;

	public GleichseitigesDreieck(double seitenLaenge) {
		
		super(seitenLaenge, seitenLaenge, seitenLaenge);
		this.seitenLaenge=seitenLaenge;
	}

	public double aussenKreisRadius() {
		return seitenLaenge*seitenLaenge*seitenLaenge/(4*flaeche());
	}

}
