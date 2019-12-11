package figurenROH;


public class Dreieck extends Figur2D {
	private double seiteA;
	private double seiteB;
	private double seiteC;
	
	//Default Konstruktor wurde bewusst weggelassen
	public Dreieck(double a, double b, double c)
	{
		if( konstruierbar(a,b,c)){
			this.seiteA = a;
			this.seiteB = b;
			this.seiteC = c;
		}
		else{
			System.out.println("Dreieck nicht konstruierbar. Standarddreieck erstellt.");
			this.seiteA = 1;
			this.seiteB = 1;
			this.seiteC = 1;
		}
	}
	//Kopierkonstruktor
	public Dreieck(Dreieck original){
		//Konstruktor mit Wertuebergabe wird genutzt
		this( original.getSeiteA(), original.getSeiteB(), original.getSeiteC() );
	}

	public double getSeiteA() {
		return seiteA;
	}
	public void setSeiteA(double seiteA) {
		
		if( konstruierbar(seiteA, this.seiteB, this.seiteC))
			this.seiteA = seiteA;
		else
			System.out.println("Seitenaenderung nicht m�glich");
	}
	public double getSeiteB() {
		return seiteB;
	}
	public void setSeiteB(double seiteB) {
		
		if( konstruierbar(this.seiteA, seiteB, this.seiteC))
			this.seiteB = seiteB;
		else
			System.out.println("Seitenaenderung nicht moeglich");
	}
	public double getSeiteC() {
		return seiteC;
	}
	public void setSeiteC(double seiteC) {
		
		if( konstruierbar(this.seiteA, this.seiteB, seiteC))
			this.seiteC = seiteC;
		else
			System.out.println("Seiten�nderung nicht m�glich");
	}
	public double getHoehe(){
		return this.flaeche()*2/this.seiteB;
	}

	@Override
	public double flaeche()
	{
		//Anwendung der Heronschen Formel
		double s=(seiteA+seiteB+seiteB)/2;
		return Math.sqrt(s*(s-seiteA)*(s-seiteB)*(s-seiteC));
	}

	@Override
	public double umfang()
	{
		return this.seiteA + this.seiteB + this.seiteC;
	}

	public static boolean konstruierbar(double a, double b, double c){
		boolean machbar=false;
		
		if(c + b > a && b + a > c && c + a > b)
			machbar = true;
		return machbar;
	}

	public String toString(){
		return "Seite A: "+ seiteA+", Seite B: "+ seiteB +", Seite C: " 
				+ seiteC+", Flaeche: "+ flaeche()+", Umfang: "+ umfang();
	}
}
