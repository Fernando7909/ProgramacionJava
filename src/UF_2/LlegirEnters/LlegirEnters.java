package UF_2;

import java.util.Scanner;
public class LlegirEnters {
    public static void main (String[] args) {
        LlegirEnters programa = new LlegirEnters();
        programa.inici();
    }
    public void inici() {
        System.out.println("Llegiu un double pel teclat:");
        double a = llegirDoubleTeclat();
        System.out.println("L’double ha estat " + a + ".");
        System.out.println("Llegiu un altre double pel teclat:");
        a = llegirDoubleTeclat();
        System.out.println("L’altre double ha estat " + a + ".");
    }
    //1. Quin tipus de valor genera? Un enter (int)
    public double llegirDoubleTeclat() {
        //2. Es fa el codi que llegeix un únic enter del teclat, com s’ha fet sempre
        //No canvia absolutament res...
        Scanner lector = new Scanner(System.in);
        double doubleLlegit = 0;
        boolean llegit = false;
        while (!llegit) {
            llegit = lector.hasNextDouble();
            if (llegit) {
                doubleLlegit = lector.nextDouble();
            }
            else {
                System.out.println("Això no és un double.");
                lector.next();
            }
        }
        lector.nextLine();
        //3. Un cop fet, quina variable t  el resultat? "enterLlegit"
        //4. Cal fer "return" damunt seu
        return doubleLlegit;
    }
}
