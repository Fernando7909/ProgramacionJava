package MP03_Marina.UF_3.Llegir_Notes;

import java.io.File;
import java.util.Scanner;

public class LlegirNotes {
    //la paraula fi serveix com a marca de final de fitxer
    public static final String MARCA_FI = "fi";

    public static void main (String[] args) {
        LlegirNotes programa = new LlegirNotes();
        programa.inici();
    }
    public void inici() {
        try {
            File f = new File("C:\\Users\\Propietario\\Desktop\\ProgramacionJava\\src\\MP03_Marina\\UF_3\\Llegir_Notes\\Notes.txt");
            Scanner lector = new Scanner(f);
            boolean llegir = true;
            while (llegir) {
                String nom = lector.next();
                if (MARCA_FI.equals(nom)) {
                    llegir = false;
                }
                else {
                    String cognom = lector.next();
                    System.out.print("Estudiant: " + nom + " " + cognom);
                    //Noteu com un scanner es pot passar com paràmetre
                    double media = llegirNotes(lector);
                    System.out.println("− Mitjana: " + media);
                }
            }
            //Cal tancar el fitxer
            lector.close();
        }
        catch(Exception e) {
            //Excepció!
            System.out.println("Error llegint estudiants: " + e);
        }
    }

    /** Donat un Scanner en un fitxer quan l’apuntador es troba sobre l’inici
     * de les notes, s’extreuen i es calcula la mitjana.
     *
     * @param lector Scanner a processar
     * @return Mitjana de notes
     */
    public double llegirNotes(Scanner lector) {
        double media = 0;
        try {
            //Es fan lectumedia. Cal controlar excepcions també!
            int numNotes = lector.nextInt();
            for (int i = 0; i < numNotes; i++) {
                //S’acumula el valor de les notes
                media = media + lector.nextDouble();
            }
            //Es calcula nota mitjana
            media = media/numNotes;
        }
        catch (Exception e) {
            //Excepció!
            System.out.println("Error llegint notes: " + e);
        }
        return media;
    }
}

