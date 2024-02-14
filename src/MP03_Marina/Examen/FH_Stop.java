package Examen;

import java.util.Scanner;

public class FH_Stop {
  public static void main(String[] args) {

    Scanner lector = new Scanner(System.in);
    String palabra_prohibida = "stop";
    String palabra_introducida = " ";

    System.out.println("Escribe una palabra. Vigila que no sea la prohibida: ");


    while (!palabra_introducida.toLowerCase().equalsIgnoreCase(palabra_prohibida)) {  
      palabra_introducida = lector.nextLine();

      if (palabra_introducida.equalsIgnoreCase(palabra_prohibida)) {
        System.out.println("Has escrito la palabra prohibida. El programa ha terminado.");
        break;

      } 
      else {
        System.out.println("Buena palabra!!! ¿Cuál es la siguiente palabra que quieres evaluar?");
      }
    }
  }
}
