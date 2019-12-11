package figurenROH;

public class Stern extends ZusammengesetzteFigur{

	public Stern(double zackenbreite, double zackenlaenge, int anzahlZacken){
		Figur2D zentrum;
		switch(anzahlZacken){
		case 3: zentrum = new GleichseitigesDreieck(zackenbreite); break;
		case 5: zentrum = new Pentagon(zackenbreite); break;
		default: zentrum = new Hexagon(zackenbreite); anzahlZacken= 6;break;
		}
		addTeilfigur(zentrum);
		for( int i=1; i < anzahlZacken; i++){
			addTeilfigur( new Dreieck( zackenbreite, zackenlaenge, zackenlaenge));
		}
		
	}
	@Override
	public double umfang() {
		double u =0;
		for( Figur2D f : getTeile())
			u+= f.umfang();

		return u - getTeilfigur(0).umfang();
	}

}
