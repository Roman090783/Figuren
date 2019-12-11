package figurenROH;


public class Maennchen extends ZusammengesetzteFigur {
	
	/** Zugriffe auf die Extremitäten als Eigenschaften in der Klasse, um den 
	 *  Zugriff auf einzelne Körperteile zu erleichtern.
	 *  Erstellung der Instanzen jedoch nur 1x  
	 */
	private Kreis kopf; 
	private Dreieck koerper;
	private Rechteck[] armBein = new Rechteck[4];

	public Maennchen(double kopfRadius, double koerperseite, 
			double koerperBreite,double armBeinLaenge, double armBeinBreite){
		
		kopf = new Kreis(kopfRadius);
		this.getTeile().add(kopf);
		koerper = new Dreieck( koerperseite, koerperseite, koerperBreite);
		this.getTeile().add(koerper);

		for(int i= 0 ; i < 4; i++){
			armBein[i]= new Rechteck(armBeinLaenge, armBeinBreite);
			this.getTeile().add(armBein[i]);
		}
	}
	public Maennchen( Kreis kopf, Dreieck koerper, Rechteck armBein){
		this.kopf = new Kreis(kopf.getRadius());
		this.getTeile().add(this.kopf);
		this.koerper = new Dreieck( koerper);
		this.getTeile().add(koerper);

		for(int i= 0 ; i < 4; i++){
			this.armBein[i]= new Rechteck(armBein);
			this.getTeile().add(this.armBein[i]);
		}
	}

	@Override
	public double umfang() {
		
		double umfang = kopf.umfang()+koerper.umfang() ;
		
		for( int i =0; i < armBein.length; i++){
			umfang += armBein[i].umfang();
			//abzüglich der Berührungsflächen von Armen und Beinen:
			umfang -= armBein[i].getBreite()*2;
		}
		return umfang;
	}
}
