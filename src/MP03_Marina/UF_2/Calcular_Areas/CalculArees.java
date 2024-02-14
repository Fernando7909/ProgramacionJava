//importem la biblioteca Scanner per a poder recolir dades de la temrinal
import java.util.Scanner;

public class CalculArees {
  public static void main (String args[]){

    //declarem l'objecte Scanner per a poder recolir dades de la temrinal
    Scanner s = new Scanner(System.in);

    //demanen a l'usuari la figura que vol calcular l'àera
    System.out.println("De quina figura vols calcular l'area?\n");
    System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");

    //recollim la dada entrada per terminal
    String figura = s.nextLine();

    //definim les variables que utilitzarem en tots els casos
    double area = 0;

    //cas en que la figura = "triangle"
    if (figura.equals("triangle")){
      double b = 23.0;
      double h = 8.0;
      area = (b*h)/2;
    }

    //cas en que la figura = "quadrat"
    else if (figura.equals("quadrat")){
      double r = 37.0;
      //funció matemàtica que eleva a 2 el radi
      area = Math.pow(r, 2);
    }

    //cas en que la figura = "rectangle"
    else if (figura.equals("rectangle")){
      double a = 68.0;
      double b = 39.0;
      area = a*b;
    }

    //cas en que la figura = "trapezi"
    else if (figura.equals("trapezi")){
      double a = 35.0;
      double b = 16.0;
      double h = 5.0;
      area = ((a*b)*h)/2;
    }

    //cas en que la figura = "rombe"
    else if (figura.equals("rombe")){
      double dM = 75.0;
      double dm = 30.0;
      area = (dM*dm)/2;
    }

    //cas en que la figura = "paralelogram"
    else if (figura.equals("paralelogram")){
      double b = 45.0;
      double h = 13.0;
      area = b*h;
    }

    //cas en que la figura = "cercle"
    else if (figura.equals("cercle")){
      System.out.println("Quin es el radi del cercle?");
      double r = s.nextDouble();
      //funció matemàtica que eleva a 2 el radi
      //Math.PI = nombre pi (3.14159....)
      area = Math.pow(r, 2)*Math.PI;
    }

    //fem el system out per imprimir a terminal
    System.out.println("L'area del " + figura + " es " +area);
  }
}
