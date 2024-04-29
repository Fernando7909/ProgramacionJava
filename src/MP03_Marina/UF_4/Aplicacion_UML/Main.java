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
        boolean opcionValida1 = false;

        while (!opcionValida1) {
            String opcion1 = lector.nextLine().toUpperCase();
            switch (opcion1) {
                case "Y":
                    seleccionarAplicacion();
                    opcionValida1 = true;
                    break;
                case "N":
                    finalizarEjecucion();
                    opcionValida1 = true;
                    break;
                default:
                    System.out.println("Opcion NO valida. Selecciona una opción");
            }
        }
    }
    public void seleccionarAplicacion(){
        System.out.println("Tenemos 2 tipos de Aplicaciones disponibles: Web o Movil.");
        System.out.println("Selecciona una de las 2 Aplicaciones: ");
        boolean opcionValida2 = false;

        while (!opcionValida2) {
            String opcion2 = lector.nextLine().toUpperCase();
            switch (opcion2) {
                case "WEB":
                    Web web = new Web();
                    web.crearAplicacionWeb();
                    opcionValida2 = true;
                    break;
                case "MOVIL":
                    Movil movil = new Movil();
                    movil.crearAplicacionMovil();
                    opcionValida2 = true;
                    break;
                default:
                    System.out.println("Opcion NO valida. Selecciona una opción");
            }
        }
    }
    public void finalizarEjecucion(){
        fin = true;
        lector.close();
        System.out.println("Hasta la próxima!!");
    }
}
