package mitarbeiterROH;

public class Buerohengst {

	private double festgehalt;

	public Buerohengst(Buerohengst original) {
		festgehalt = original.getFestgehalt();
	}
	public Buerohengst(int id, String name, double festgehalt) {
		setFestgehalt(festgehalt);
	}

	public double getFestgehalt() {
		return festgehalt;
	}
	public double einkommen() {
		return festgehalt;
	}

	public void setFestgehalt(double festgehalt) {
		if(festgehalt > 300) // Mindestlohn 300 Euro
			this.festgehalt = festgehalt;
		else this.festgehalt = 300;
	}
	protected void setID(int id){
	}
	public String toString(){
		return super.toString() +"Buerohengst hat Einkommen: " + festgehalt;
	}
}
