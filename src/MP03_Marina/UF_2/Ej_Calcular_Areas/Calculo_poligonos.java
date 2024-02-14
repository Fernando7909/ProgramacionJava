package MP03_Marina.UF_2.Ej_Calcular_Areas;

import java.util.Scanner;
public class Calculo_poligonos {
    Scanner lector = new Scanner(System.in);

    public double triangulo(){
        System.out.println("Introduce la medida de la base: ");
        double b = lector.nextDouble();
        System.out.println("Introduce la medida de la altura: ");
        double h = lector.nextDouble();
        return (b*h)/2;
    }
    public double cuadrado(){
        System.out.println("Introduce la medida del radio: ");
        double r = lector.nextDouble();
        //funció matemàtica que eleva a 2 el radi
        return Math.pow(r, 2);
    }
    public double rectangulo(){
        System.out.println("Introduce la medida de un lado: ");
        double a = lector.nextDouble();
        System.out.println("Introduce la medida del otro lado: ");
        double b = lector.nextDouble();
        return a*b;
    }
    public double trapecio(){
        System.out.println("Introduce la medida de un lado: ");
        double a = lector.nextDouble();
        System.out.println("Introduce la medida del otro lado: ");
        double b = lector.nextDouble();
        System.out.println("Introduce la medida de la altura");
        double h = lector.nextDouble();
        return ((a*b)*h)/2;
    }
    public double rombo(){
        System.out.println("Introduce la medida de un lado: ");
        double dM = lector.nextDouble();
        System.out.println("Introduce la medida del oro lado. ");
        double dm = lector.nextDouble();
        return (dM*dm)/2;
    }
    public double paralelogramo(){
        System.out.println("Introduce la medida de la base: ");
        double b = lector.nextDouble();
        System.out.println("Introduce la medida de la altura: ");
        double h = lector.nextDouble();
        return b*h;
    }
    public double circulo(){
        System.out.println("¿Cual es el radio del circulo?");
        double r = lector.nextDouble();
        //funció matemàtica que eleva a 2 el radi
        //Math.PI = nombre pi (3.14159....)
        return Math.pow(r, 2)*Math.PI;
    }
}
