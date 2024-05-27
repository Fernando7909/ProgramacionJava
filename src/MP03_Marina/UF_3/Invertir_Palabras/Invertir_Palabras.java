package MP03_Marina.UF_3.Invertir_Palabras;

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;

public class Invertir_Palabras {
    public static void main(String[] args){
        Invertir_Palabras programa = new Invertir_Palabras();
        programa.inicio();
    }

    public void inicio() {
        try {
            File lectura = new File("C:\\Users\\Propietario\\Desktop\\ProgramacionJava\\src\\MP03_Marina\\UF_3\\Invertir_Palabras\\archivo.txt");
            File escritura = new File("C:\\Users\\Propietario\\Desktop\\ProgramacionJava\\src\\MP03_Marina\\UF_3\\Invertir_Palabras\\archivo_invertido.txt");

            Scanner lectorFicheros = new Scanner(lectura);
            PrintStream printstream = new PrintStream(escritura);

            String fraseInvertida = invertirFrase(lectorFicheros.nextLine());
            printstream.print("LA FRASE INVERTIDA ES: " + fraseInvertida);

            lectorFicheros.close();
            printstream.close();
        }
        catch (Exception e){
            System.out.println("ERROR: " + e);
        }
    }

    public String invertirFrase(String frase){
        String[] palabras = frase.split("\\s+");  //Creamos un array con cada palabra, y mediante split("\\s+"), separamos cada palabra por los espacios en blanco
        String fraseInvertida = "";

        for (int i = palabras.length - 1; i >= 0; i--) {
            String palabra = palabras[i];
            fraseInvertida = fraseInvertida + invertirPalabra(palabra) + " ";
        }

        return fraseInvertida.trim();  //El metodo trim() elimina los espacios del principio y final de la cadena
    }

    public String invertirPalabra(String palabra){
        String palabraInvertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida = palabraInvertida + palabra.charAt(i);
        }
        return palabraInvertida;
    }
}
