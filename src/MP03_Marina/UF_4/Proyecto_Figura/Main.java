package MP03_Marina.UF_4.Proyecto_Figura;

import java.util.Scanner;
public class Main {
    Scanner lector = new Scanner(System.in);
    boolean fin = false;
    double area;
    String figura;
    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
    }
    //Funciones Constructoras:
    Figura Fig0 = new Figura();
    Triangulo Tri0 = new Triangulo();
    Cuadrado Cu0 = new Cuadrado();
    Rectangulo Re0 = new Rectangulo();
    Trapecio Tra0 = new Trapecio();
    Rombo Ro0 = new Rombo();
    Paralelogramo Pa0 = new Paralelogramo();
    Circulo Ci0 = new Circulo();

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
            area = leerDatos(figura);
            area = calcularArea(area);
            imprimirDatos(figura, area);
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
    public double leerDatos(String figura){

        if (figura.equalsIgnoreCase("Triangulo")){
            area = Tri0.calcularArea();
        }
        else if (figura.equalsIgnoreCase("Trapecio")) {
            area = Tra0.calcularArea();
        }
        else if (figura.equalsIgnoreCase("Rombo")) {
            area = Ro0.calcularArea();
        }
        else if (figura.equalsIgnoreCase("Rectangulo")) {
            area = Re0.calcularArea();
        }
        else if (figura.equalsIgnoreCase("Paralelogramo")) {
            area = Pa0.calcularArea();
        }
        else if (figura.equalsIgnoreCase("Cuadrado")) {
            area = Cu0.calcularArea();
        }
        else if (figura.equalsIgnoreCase("Circulo")) {
            area = Ci0.calcularArea();
        }
        return area;
    }
    public double calcularArea(double Area){
        return area;
    }

    public void imprimirDatos(String figura, double area){
        System.out.println("El área de la figura " + figura + " es de : " + area + " cm2.");
        System.out.println("\n");
        System.out.println("------------------------------------------------------------");
    }
    public void finalizarEjecucion() {
        fin = true;
    }


    //Esta parte del código que está comentada, hace referencia a la primera parte del ejercicio.
    /*Figura[] figuras = {Tri0, Cu0, Re0, Tra0, Ro0, Pa0, Ci0};

    for (Figura figura : figuras){
        System.out.println("La figura con ID: " + figura.getId() + " es un " + figura.getFigura() + ".\nEl area del " + figura.getFigura() + " es: " + figura.calcularArea());
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
    }
     */
}
