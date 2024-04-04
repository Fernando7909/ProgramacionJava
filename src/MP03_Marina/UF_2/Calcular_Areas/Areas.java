package MP03_Marina.UF_2.Calcular_Areas;

import java.util.Scanner;

public class Areas { //Variables globales. Se pueden usar en todo el programa
    Scanner lector = new Scanner(System.in);
    double Area; /*Debido a que Area esta declarada como variable global, no es necesario un return de Area en cada calculo
    del area de cada figura. Se almacena directamente*/
    public static void main(String[] args){
        Areas programa = new Areas();
        programa.inicio();
    }
    public void inicio(){
        leerLista();
        String Figura = escogerFigura();    //Una vez escrita la figura que queremos, se almacena este dato en la variable
        calcularAreas(Figura);
        System.out.println("El Area de la figura " + Figura + " es " + Area);
    }
    public void leerLista(){
        System.out.println("De que figura quieres calcular el area?\n");
        System.out.println("Tienes las siguientes opciones: triangulo, cuadrado, rectangulo, trapecio, rombo, paralelogramo o circulo.\n");
    }
    public String escogerFigura() {     //Parametro de salida es un String
        System.out.println("Escribe el nombre de una figura: ");
        String Figura = lector.nextLine();
        return  Figura;
    }
    public void calcularAreas(String Figura){   //Parametro de entrada Figura, ya que lo vamos a utilizar
        if (Figura.equals("triangulo")){
            triangulo();
        }
        else if (Figura.equals("cuadrado")){
        cuadrado();
        }
        else if (Figura.equals("rectangulo")){
        rectangulo();
        }
        else if (Figura.equals("trapecio")) {
        trapecio();
        }
        else if (Figura.equals("rombo")) {
        rombo();
        }
        else if (Figura.equals("paralelogramo")) {
        paralelogramo();
        }
        else if (Figura.equals("circulo")) {
        circulo();
        }
    }
    public double triangulo(){
        System.out.println("Introduce la medida de la base: ");
        double b = lector.nextDouble();
        System.out.println("Introduce la medida de la altura: ");
        double h = lector.nextDouble();
        Area = (b*h)/2;
        return Area;
    }
    public void cuadrado(){
        System.out.println("Introduce la medida del radio: ");
        double r = lector.nextDouble();
        //funció matemàtica que eleva a 2 el radi
        Area = Math.pow(r, 2);
    }
    public void rectangulo(){
        System.out.println("Introduce la medida de un lado: ");
        double a = lector.nextDouble();
        System.out.println("Introduce la medida del otro lado: ");
        double b = lector.nextDouble();
        Area = a*b;
    }
    public void trapecio(){
        System.out.println("Introduce la medida de un lado: ");
        double a = lector.nextDouble();
        System.out.println("Introduce la medida del otro lado: ");
        double b = lector.nextDouble();
        System.out.println("Introduce la medida de la altura");
        double h = lector.nextDouble();
        Area = ((a*b)*h)/2;
    }
    public void rombo(){
        System.out.println("Introduce la medida de un lado: ");
        double dM = lector.nextDouble();
        System.out.println("Introduce la medida del oro lado. ");
        double dm = lector.nextDouble();
        Area = (dM*dm)/2;
    }
    public void paralelogramo(){
        System.out.println("Introduce la medida de la base: ");
        double b = lector.nextDouble();
        System.out.println("Introduce la medida de la altura: ");
        double h = lector.nextDouble();
        Area = b*h;
    }
    public void circulo(){
        System.out.println("¿Cual es el radio del circulo?");
        double r = lector.nextDouble();
        //funció matemàtica que eleva a 2 el radi
        //Math.PI = nombre pi (3.14159....)
        Area = Math.pow(r, 2)*Math.PI;
    }
}
