package mitarbeiterROH;

public class Malocher extends Mitarbeiter {

	private double satz;
	private double stundenSatz;
	private int anzahlStunden;

	public Malocher(Malocher original) {
		super(original);
		setStundenSatz(original.getStundenSatz());
		setAnzahlStunden(original.getAnzahlStunden());
	}
	public Malocher(int id, String name) {
		super(id, name);

		/*
		 * Konstruktoraufruf super immer an erster Stelle
		 */
		setStundenSatz(satz);
		setAnzahlStunden(0);
	}
	public double getStundenSatz() {
		return stundenSatz;
	}
	public void setStundenSatz(double stundenSatz) {
		if( stundenSatz > 0)
			this.stundenSatz = stundenSatz;
	}
	public int getAnzahlStunden() {
		return anzahlStunden;
	}
	public void setAnzahlStunden(int anzahlStunden) {
		if( anzahlStunden > 0)
		this.anzahlStunden = anzahlStunden;
	}
	protected void setID(int id){

	}
	public double einkommen(){
		return anzahlStunden *stundenSatz;
	}
	public String toString(){
		return super.toString() +("Malocher hat Einkommen: " + einkommen());
	}
}
