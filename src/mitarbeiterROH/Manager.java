package mitarbeiterROH;

public class Manager {

	private double bonus;
	private double festgehalt;


	public Manager(Manager original) {
		festgehalt = original.getFestgehalt();
		bonus = original.getBonus();
	}

	public Manager(int id, String name, double festgehalt, double bonus) {
		//Die Manager-IDs fangen alle mit 50 an

		setBonus(bonus);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) 
	{
		//Der Bonus liegt zwischen 1 und 200%
		if(bonus > 0 && bonus <= 2)
			this.bonus = bonus;
		else
			this.bonus = 0;
	}
	protected void setID(int id){

	}
	public double berechneBonus(){
		return getFestgehalt() *  bonus;
	}

	public double getFestgehalt() {
		return festgehalt;
	}

	public void setFestgehalt(double festgehalt) {
		if(festgehalt > 1000) // Mindestlohn 300 Euro
			this.festgehalt = festgehalt;
		else this.festgehalt = 1000;
	}

	public double einkommen(){
		return getFestgehalt() + berechneBonus();
	}
	public String toString(){
		return super.toString()+"Manager bekommt dazu Bonus: " + berechneBonus()+"Manager hat Einkommen: " + einkommen();
	}
}
