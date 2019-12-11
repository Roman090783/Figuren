package figurenROH;

//Ein Tetraeder hat vier gleiche gleichseitige Dreiecke
public class Tetraeder extends GeradesPrisma {
	private double kante;
    public Tetraeder(double kante) {

        super(calcHoehe(kante), new GleichseitigesDreieck(kante));
		this.kante=kante;
    }


    public double mantel() {
        return oberflaeche()/4*3;
    }

    //Hilfsmethode calcHoehe muss static sein, da sie im Konstruktor eingesetzt wird
    //und die Instanz im Konstruktor noch nicht fertig aufgebaut ist
    private static double calcHoehe(double kante) {

        //Strecke zum Mittelpunkt
        double sm = new GleichseitigesDreieck(kante).aussenKreisRadius() / 3;
        //Pythagoras
        return Math.sqrt(kante * kante - sm * sm);
    }

    public double getKante() {
        //GleichseitigesDreieck d = (GleichseitigesDreieck) getGrund();
        return kante;
        //return d.getSeitenLaenge();
    }



}
