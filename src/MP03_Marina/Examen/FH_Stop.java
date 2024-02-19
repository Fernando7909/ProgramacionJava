package MP03_Marina.Examen;

import java.util.Scanner;

public class FH_Stop {
  public static void main(String[] args) {

    Scanner lector = new Scanner(System.in);
    String palabra_prohibida = "stop";
    String palabra_introducida = " ";
    boolean encontrada = false;

    System.out.println("Escribe una palabra. Vigila que no sea la prohibida: ");


    while (!encontrada) {
      palabra_introducida = lector.nextLine();

      if (palabra_introducida.equalsIgnoreCase(palabra_prohibida)) {
        System.out.println("Has escrito la palabra prohibida.\nEl programa ha terminado.\n-----------");
        encontrada = true;
      } 
      else {
        System.out.println("Buena palabra!!! ¿Cuál es la siguiente palabra que quieres evaluar?");
      }
    }
  }
}
