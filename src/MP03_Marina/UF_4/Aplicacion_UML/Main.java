package MP03_Marina.UF_4.Aplicacion_UML;

import java.lang.module.ModuleFinder;
import java.util.Scanner;

public class Main {
    Scanner lector = new Scanner(System.in);
    boolean fin = false;

    public static void main(String[] args){
        Main programa = new Main();
        programa.inicio();
    }
    public void inicio(){
        if (!fin){
            mostrarMenu();
            seleccionarOpcion();
        }
    }
    public void mostrarMenu(){
        System.out.println("Bienvenido al Programa de Aplicaciones!!!");
        System.out.println("Si quieres comenzar en programa escribe Yes [Y]");
        System.out.println("Si quieres finalizar el programa escribe No [N]");
    }
    public void seleccionarOpcion(){
        System.out.println("Selecciona una de las 2 opciones: ");
        String opcion1 = lector.nextLine();

        switch (opcion1.toUpperCase()){
            case "Y":
                seleccionarAplicacion();
                break;
            case "N":
                finalizarEjecucion();
                break;
            default:
                System.out.println("Opcion NO valida.");
        }
        lector.close();
    }
    public void seleccionarAplicacion(){
        System.out.println("Tenemos 2 tipos de Aplicaciones disponibles: Web o Movil.");
        System.out.println("Selecciona una de las 2 Aplicaciones: ");
        String opcion2 = lector.nextLine();

        switch (opcion2.toUpperCase()){
            case "WEB":
                Web web = new Web();
                break;
            case "MOVIL":
                Movil movil = new Movil();
                break;
            default:
                System.out.println("Opcion NO valida.");
        }
    }
    public void finalizarEjecucion(){
        fin = true;
    }
}
