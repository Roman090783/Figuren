package mitarbeiterROH;
public abstract class Mitarbeiter 
{
	private int id;
	private String name;

	//Deklaration der Signatur "Ich wei� nicht wie, sondern nur dass..."
	//abstract bedeutet Grundprinzip der Methode (Signatur)
	//wird ohne Inhalt deklariert
	public abstract double einkommen();
	
	public Mitarbeiter(int id, String name){
		setID(id);
		this.name = name;
	}
	/*
	 * Kopierkonstruktor erstellt einen Klon
	 */
	public Mitarbeiter(Mitarbeiter original){
		name = original.getName();
		setID( original.getID() );
	}
	protected void setID(int id){
		if(id > 0)
			this.id=id;
		else
			this.id= -id;
	}
	public int getID(){
		return this.id;
	}
	public void setName(String name){
		String erlaubt="";
		
		for(int i=0, j=0; i< name.length();i++ )
			if(name.charAt(i) >='a' && name.charAt(i) <='z'){
				if( j==0 )
					erlaubt += (char)(name.charAt(i)+('A'-'a')); 
				else
					erlaubt += name.charAt(i);
				j++;
			}
			else
				if(name.charAt(i) >='A' && name.charAt(i) <='Z'){
					if(j>0)
						erlaubt += (char)(name.charAt(i)-('A'-'a'));
					else erlaubt += name.charAt(i);
				j++;
			}
		if(erlaubt.length()>1)
			this.name = erlaubt;
		else{
			this.name = "Muster";
			System.out.println("Name ist zu kurz!");
		}
	}
	public String getName(){
		return this.name;
	}
	public String toString(){
		return ("ID: " + id + "\nName: " + name);
	}

}
