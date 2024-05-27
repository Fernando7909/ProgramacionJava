package MP03_Marina.UF_4.Aplicacion_UML;

import java.util.Scanner;

public class Main {
    Scanner lector = new Scanner(System.in);
    boolean fin = false;

    public static void main(String[] args){
        Main programa = new Main();
        programa.inicio();
    }
    public void inicio(){
        while (!fin){
            mostrarMenu();
            seleccionarAplicacion();
            seleccionarOpcion();
        }
    }
    public void mostrarMenu(){
        System.out.println("Bienvenido al Programa de Aplicaciones!!!");
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
                    System.out.println("Opcion NO valida. Selecciona una opción valida (WEB o MOVIL)");
            }
        }
    }
    public void seleccionarOpcion(){
        System.out.println("------------------------------------------\n");
        System.out.println("Si quieres volver a ejecutar el programa escribe [Y] Yes");
        System.out.println("Si quieres finalizar el programa escribe [N] No");
        System.out.println("Selecciona una de las 2 opciones: ");
        boolean opcionValida1 = false;

        while (!opcionValida1) {
            String opcion1 = lector.nextLine().toUpperCase();
            switch (opcion1) {
                case "Y":
                    fin = false;
                    opcionValida1 = true;
                    break;
                case "N":
                    finalizarEjecucion();
                    opcionValida1 = true;
                    break;
                default:
                    System.out.println("Opcion NO valida. Selecciona una  de las 2 opciones [Y] o [N]");
            }
        }
    }
    public void finalizarEjecucion(){
        fin = true;
        System.out.println("Hasta la próxima!!");
    }
}
