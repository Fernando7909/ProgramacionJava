package MP03_Marina.UF_3.ComprovarFicheros;

import java.io.File;

public class ComprovarFicheros {
    public static void main(String[] args){
        ComprovarFicheros programa = new ComprovarFicheros();
        programa.inicio();
    }
    public void inicio(){
        File EjemploFotos = new File("C:\\Users\\Propietario\\Desktop\\EjemploFotos");
        File fotos = new File("C:\\Users\\Propietario\\Desktop\\EjemploFotos\\fotos");
        File document = new File("C:\\Users\\Propietario\\Desktop\\EjemploFotos\\Document.txt");

        System.out.println(EjemploFotos.getAbsolutePath() + " existe? " + EjemploFotos.exists());
        mostrarEstado(fotos);
        mostrarEstado(document);
    }
    public void mostrarEstado(File f){
        System.out.println(f.getAbsolutePath() + " es un fichero?? " + f.isFile());
        System.out.println(f.getAbsolutePath() + " es una carpeta?? " + f.isDirectory() + "\n");
    }
}
