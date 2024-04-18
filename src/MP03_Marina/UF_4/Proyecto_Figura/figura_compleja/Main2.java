package MP03_Marina.UF_4.Proyecto_Figura.figura_compleja;

import java.util.Scanner;
public class Main2 {
    Scanner lector = new Scanner(System.in);
    boolean fin = false;
    double area;
    String figura;

    public static void main(String[] args) {
        Main2 programa = new Main2();
        programa.inicio();
    }
    //Funciones Constructoras:
    Figura Fig0 = new Figura();

    public void inicio() {
        while (!fin) {
            mostrarMenu();
            seleccionarOpcion();
        }
    }
    public void mostrarMenu(){
        System.out.println("Bienvenido al programa de calculo de Areas!!!!");
        System.out.println("Si quieres comenzar el programa, escribe [start]");
        System.out.println("Si quieres que el programa finalice, escribe [end]");
        System.out.println("Opcion elegida: ");
    }
    public void seleccionarOpcion(){
        String opcion = lector.nextLine();

        if (opcion.equalsIgnoreCase("start")){
            figura = seleccionarFigura();
            leerDatos(figura);
        }
        else if (opcion.equalsIgnoreCase("end")) {
            finalizarEjecucion();
        }
        else {
            System.out.println("ERROR! Selecciona una de las 2 opciones.\n");
        }
    }
    public String seleccionarFigura() {

        System.out.println("Selecciona el tipo de figura entre las siguientes: ");
        System.out.println("Circulo, Cuadrado, Paralelogramo, Rectangulo, Rombo, Trapecio y Triangulo");
        System.out.print("Ingesa aqui el nombre de la figura elegida: ");

        figura = lector.nextLine();

        if (figura.equalsIgnoreCase("Triangulo")){
            figura = "Triangulo";
        }
        else if (figura.equalsIgnoreCase("Trapecio")) {
            figura = "Trapecio";
        }
        else if (figura.equalsIgnoreCase("Rombo")) {
            figura = "Rombo";
        }
        else if (figura.equalsIgnoreCase("Rectangulo")) {
            figura = "Rectangulo";
        }
        else if (figura.equalsIgnoreCase("Paralelogramo")) {
            figura = "Paralelogramo";
        }
        else if (figura.equalsIgnoreCase("Cuadrado")) {
            figura = "Cuadrado";
        }
        else if (figura.equalsIgnoreCase("Circulo")) {
            figura = "Circulo";
        }
        else {
            System.out.println("ERROR! Escribe una de las figuras de las opciones anteriores.");
        }
        return figura;
    }
    public void leerDatos(String figura){

        if (figura.equalsIgnoreCase("Triangulo")){
            Triangulo Tri = new Triangulo();
            System.out.println("Introduce la medida de base del Triangulo: ");
            Tri.setBase(lector.nextInt());
            System.out.println("Introduce la medida de altura (h) del triangulo: ");
            Tri.setH(lector.nextInt());
            Tri.imprimirDatos();
        }
        else if (figura.equalsIgnoreCase("Trapecio")) {
            Trapecio Tra = new Trapecio();
            System.out.println("Introduce la medida del 1º lado del Trapecio: ");
            Tra.setA(lector.nextInt());
            System.out.println("Introduce la medida del 2º lado del Trapecio: ");
            Tra.setB(lector.nextInt());
            System.out.println("Introduce la medida de altura (h) del Trapecio: ");
            Tra.setH(lector.nextInt());
            Tra.imprimirDatos();
        }
        else if (figura.equalsIgnoreCase("Rombo")) {
            Rombo Ro = new Rombo();
            System.out.println("Introduce la medida del Diagonal Mayor del Rombo: ");
            Ro.setDM(lector.nextInt());
            System.out.println("Introduce la medida del Diagonal Menor del Rombo: ");
            Ro.setDm(lector.nextInt());
            Ro.imprimirDatos();
        }
        else if (figura.equalsIgnoreCase("Rectangulo")) {
            Rectangulo Re = new Rectangulo();
            System.out.println("Introduce la medida del lado1 del Rectangulo: ");
            Re.setLado1(lector.nextInt());
            System.out.println("Introduce la medida del lado2 del Rectangulo: ");
            Re.setLado2(lector.nextInt());
            Re.imprimirDatos();
        }
        else if (figura.equalsIgnoreCase("Paralelogramo")) {
            Paralelogramo Pa = new Paralelogramo();
            System.out.println("Introduce la medida de un lado del Paralelogramo: ");
            Pa.setB(lector.nextInt());
            System.out.println("Introduce la medida de altura (h) del Paralelogramo: ");
            Pa.setH(lector.nextInt());
            Pa.imprimirDatos();
        }
        else if (figura.equalsIgnoreCase("Cuadrado")) {
            Cuadrado Cu = new Cuadrado();
            System.out.println("Introduce la medida de un lado del Cuadrado: ");
            Cu.setLado(lector.nextInt());
            Cu.imprimirDatos();
        }
        else if (figura.equalsIgnoreCase("Circulo")) {
            Circulo Ci = new Circulo();
            System.out.println("Introduce la medida del radio del Circulo: ");
            Ci.setRadio(lector.nextInt());
            Ci.imprimirDatos();
        }
        lector.nextLine();  //Limpia el Búfer
    }

    public void finalizarEjecucion() {
        fin = true;
    }
}
