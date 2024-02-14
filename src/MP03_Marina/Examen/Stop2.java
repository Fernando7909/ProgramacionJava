import java.util.Scanner;

public class Stop2 {
  public static void main(String[] args){

    Scanner lector = new Scanner(System.in);
    String palabra_prohibida = "Stop";
    String palabra_introducida;

    System.out.println("Escribe una palabra. Vigila que no sea la palabra prohibida!");

    while (!(palabra_introducida = lector.nextLine()).equalsIgnoreCase(palabra_prohibida)) {
      System.out.println("Buena palabra! Cual es la siguienta palabra que quieres evaluar?");
    }
    System.out.println("Has dicho la palabra prohibida\nEl programa acaba aqui.\n---------");
  }
}
