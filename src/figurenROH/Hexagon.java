package figurenROH;

public class Hexagon extends N_Eck {

	public Hexagon(double seitenLaenge) {
		super(seitenLaenge, 6);
	}
	@Override
	public double flaeche() {

		return (Math.pow(this.getSeitenLaenge(),2)*3/2)*Math.sqrt(3);
	}


}
