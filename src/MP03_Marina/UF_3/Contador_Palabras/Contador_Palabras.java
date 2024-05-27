package MP03_Marina.UF_3.Contador_Palabras;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;

public class Contador_Palabras {
    public static final String MARCA_FIN = "fin";

    public static void main(String[] args) {
        Contador_Palabras programa = new Contador_Palabras();
        programa.inicio();
    }

    public void inicio() {
        try {
            File lectura = new File("C:\\Users\\Propietario\\Desktop\\ProgramacionJava\\src\\MP03_Marina\\UF_3\\Contador_Palabras\\entrada.txt");
            File escritura = new File("C:\\Users\\Propietario\\Desktop\\ProgramacionJava\\src\\MP03_Marina\\UF_3\\Contador_Palabras\\salida.txt");

            Scanner lectorFichero = new Scanner(lectura);
            PrintStream printstream = new PrintStream(escritura);

            int contador = leerPalabras(lectorFichero);
            printstream.println("El numero de palabras del fichero entrada.txt es: " + contador);

            lectorFichero.close();
            printstream.close();
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public int leerPalabras(Scanner lectorFichero) {
        int contador = 0;

        try {
            while (lectorFichero.hasNext()) {
                String palabra = lectorFichero.next();
                //Hay 2 maneras de hacerlo: cuando detecta que no encuentra ninguna palabra mas
                //o cuando encuentra la palabrabra "fin"
                if (palabra == null || palabra.equalsIgnoreCase(MARCA_FIN)) {
                    break;
                }
                contador++;
            }
        }
        catch (Exception e) {
            System.out.println("ERROR al leer las palabras: " + e.getMessage());
        }
        return contador;
    }
}
