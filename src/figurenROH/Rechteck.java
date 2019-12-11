package figurenROH;

public class Rechteck extends Figur2D{
	private double hoehe;
	private double breite;

//Default Konstruktor wurde bewu�t weggelassen
	public Rechteck(double hoehe, double breite){
		setHoehe(hoehe);
		setBreite(breite);
	}
	//Kopierkonstruktor
	public Rechteck( Rechteck r)
	{
		//Aufruf eines anderen Konstruktors im Konstruktor
		this(r.getHoehe(), r.getBreite() );
		/* oder direkt �ber setMethoden:
		setHoehe(r.getHoehe());
		setBreite(r.getBreite());
		*/
	}

	public double flaeche(){
		return breite * hoehe;
	}
	public double umfang(){
		return 2 * (breite + hoehe);
	}
	public double getHoehe(){
		return this.hoehe;
	}
	public double getBreite(){
		return this.breite;
	}
	/*
	 * Anwendung der Kapselung
	 * Es d�rfen keine unzul�ssigen Werte gesetzt werden
	 */
	public boolean setHoehe(double h){
		boolean pruef = false;
		if(h ==0)
			hoehe = 1;
		else
			if( h<0)
			hoehe = -h;
			else{
				this.hoehe = h;
				pruef = true;
			}
		return pruef;
	}
	public boolean setBreite(double b){
		boolean pruef=false;
		if(b ==0)
			breite = 1;
		else
			if( b<0)
			breite = -breite;
			else{
				this.breite = b;
				pruef = true;
			}
		return pruef;
	}
	public void show(){
		System.out.print("Hoehe: " + hoehe);
		System.out.print(", Breite: " + breite);
		System.out.print(", Flaeche: " + flaeche());
		System.out.println(", Umfang: " + umfang());
	}
}
