package MP03_Marina.UF_3;

import java.io.File;

public class Ejemplo1_file {
    public static void main(String[] args){

        Ejemplo1_file programa = new Ejemplo1_file();
        programa.inicio();
    }
    public void inicio(){
        //Se inician 2 rutas absolutas diferentes
        File carpetaABS = new File("C:/Users/Propietario/Desktop");
        File ficheroABS = new File("C:/Users/Propietario/Desktop/ejemplo1.txt");

        // Añadimos unas rutas relativas
        File carpetaREL = new File("Desktop");
        File ficheroREL = new File("Desktop/ejemplo2.txt");

        //Mostramos los datos de cada uno
        mostrarRutas(carpetaABS);
        mostrarRutas(ficheroABS);
        mostrarRutas(carpetaREL);
        mostrarRutas(ficheroREL);
    }
    public void mostrarRutas(File f){
        System.out.println("La ruta es: " + f.getAbsolutePath());
        System.out.println("Su padre es: " + f.getParent());
        System.out.println("Su nombre es: " + f.getName() + "\n");
    }
}

