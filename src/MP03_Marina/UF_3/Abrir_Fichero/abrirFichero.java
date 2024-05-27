package MP03_Marina.UF_3.Abrir_Fichero;

import java.io.File;
import java.util.Scanner;

public class abrirFichero {
    public static void main(String[] args0){
        abrirFichero programa = new abrirFichero();
        programa.inicio();
    }
    public void inicio() {
        try {
            File f = new File("C:\\Users\\Propietario\\Desktop\\ProgramacionJava\\src\\MP03_Marina\\UF_3\\Abrir_Fichero\\Document.txt");
            Scanner lector = new Scanner(f);
            System.out.println("Fichero abierto correctamente.");
        }
        catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }
}
