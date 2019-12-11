package figurenROH;

public class Kegel extends Pyramide {

	public Kegel(double hoehe, Kreis grund) {
		super(hoehe, grund);
	}

	@Override
	public double mantel() {

		Kreis grundKreis = (Kreis)getGrund(); //??????????
		//Pythagoras
		double seitenLaenge = Math.sqrt( Math.pow(getHoehe(), 2) + Math.pow(grundKreis.getRadius(), 2));
		Kreis mantelKreis = new Kreis(seitenLaenge); //??????????????
		double kreisVerhaeltnis = grundKreis.umfang()/mantelKreis.umfang();
		
		return kreisVerhaeltnis * mantelKreis.flaeche();
	}

}
