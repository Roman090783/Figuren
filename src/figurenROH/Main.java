package figurenROH;

import javax.xml.parsers.ParserConfigurationException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) {

        Figur3D[] dreiDimFiguren = new Figur3D[5];
        try {
            //Ein Quader
            dreiDimFiguren[0] = new Quader(10.0, new Rechteck(3, 4));

            //Ein Zylinder
            dreiDimFiguren[1] = new Zylinder(5.0, new Kreis(4.0));

            //Ein Dreiecksprisma
            dreiDimFiguren[2] = new DreiecksPrisma(5.0, new Dreieck(4.0, 5.0, 3.0));

            //Eine Kugel
            dreiDimFiguren[3] = new Kugel(5.0);

            //Eine Kugel
            dreiDimFiguren[4] = new Kegel(5.0, new Kreis(3.0));

//                Kreis kreis = new Kreis(1);
//                System.out.println("Flaeche: " + kreis.flaeche());
//                System.out.println("Umfang:" + kreis.umfang());

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            for (int i = 0; i < dreiDimFiguren.length; i++) {
                System.out.println("Objekt der Klasse " + dreiDimFiguren[i].getClass());
                System.out.println("Oberfl�che " + dreiDimFiguren[i].oberflaeche());
                System.out.println("Volumen " + dreiDimFiguren[i].volumen());
            }
        }
    }
}
