package MP03_Marina.UF_3.GenerarFicheroNotas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class GenerarFicheroNotas {

    public static final String MARCA_FI = "fi";

    public static void main(String[] args) {
        GenerarFicheroNotas programa = new GenerarFicheroNotas();
        programa.inici();
    }

    public void inici() {
        try {
            File lectura = new File("C:\\Users\\Propietario\\Desktop\\ProgramacionJava\\src\\MP03_Marina\\UF_3\\GenerarFicheroNotas\\Notes.txt");
            File escritura = new File("C:\\Users\\Propietario\\Desktop\\ProgramacionJava\\src\\MP03_Marina\\UF_3\\GenerarFicheroNotas\\NotaMedia.txt");

            Scanner lectorfichero = new Scanner(lectura);
            PrintStream printStream = new PrintStream(escritura);

            boolean leer = true;

            while (leer) {
                String name = lectorfichero.next();
                if (MARCA_FI.equals(name)) {
                    leer = false;
                } else {
                    String surname = lectorfichero.next();
                    double media = llegirNotes(lectorfichero);
                    printStream.println("Estudiante: " + name + " " + surname + " - Media: " + media);
                }
            }
            lectorfichero.close();
            printStream.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public double llegirNotes(Scanner lectorfichero) {
        double media = 0;
        int contador = 0;

        try {
            while (lectorfichero.hasNextDouble()) {
                double nota = lectorfichero.nextDouble();
                if (nota == -1) {
                    break;
                }
                else {
                    contador++;
                    media = media + nota;
                }
            }
            if (contador > 0) {
                media = media / contador;
            }
            else {
                System.out.println("No se encontraron notas válidas antes del -1");
            }
        }
        catch (Exception e) {
            // Excepción!
            System.out.println("Error llegint notes: " + e);
        }
        return media;
    }
}
