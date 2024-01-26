import java.util.Scanner;

public class FernandoHernandez_TaulaMultiplicar{
  public static void main(String[] args){

    Scanner lector = new Scanner(System.in);

    System.out.print("¿Hasta qué tabla de multiplicar quieres ver? ");

    if(lector.hasNextInt()) {
      int numero_tabla = lector.nextInt();

      for(int i = 1; i <= numero_tabla; i++) {
        System.out.println("Tabla del " + i);

        for (int j = 1; j <= 10; j++) {
          int resultado = i * j;
          System.out.println(i + " * " + j + " = " + resultado);
        }
        
        System.out.println("==============");
      }
    } 
    else {
      System.out.println("ERROR: Has introducido un valor incorrecto");
    }
  }
}
