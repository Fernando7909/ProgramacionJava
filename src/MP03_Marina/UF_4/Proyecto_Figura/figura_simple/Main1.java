package MP03_Marina.UF_4.Proyecto_Figura.figura_simple;

public class Main1 {
    public static void main(String[] args) {

        // Funciones Constructoras:

        Triangulo Tri = new Triangulo(5, 10);
        Tri.imprimirDatos();

        Cuadrado Cu = new Cuadrado(10);
        Cu.imprimirDatos();

        Rectangulo Re = new Rectangulo(5, 30);
        Re.imprimirDatos();

        Trapecio Tra = new Trapecio(10, 40, 50);
        Tra.imprimirDatos();

        Rombo Ro = new Rombo(10, 50);
        Ro.imprimirDatos();

        Paralelogramo Pa = new Paralelogramo(30, 25);
        Pa.imprimirDatos();

        Circulo Ci = new Circulo(15);
        Ci.imprimirDatos();

    }
}
