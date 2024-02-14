import java.util.Scanner;

public class FernandoHernandez_Stop {
  public static void main(String[] args) {

    Scanner lector = new Scanner(System.in);
    String palabra_prohibida = "stop";
    System.out.println("Escribe una palabra. Vigila que no sea la prohibida: ");

    while(true) {
      String palabra_introducida = lector.nextLine();

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
