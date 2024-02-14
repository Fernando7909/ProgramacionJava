import java.util.Scanner;

public class Diamond{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.print("Introduce el número de filas (la mitad del triangulo): ");
		int num_filas = lector.nextInt();

																//Esta 1ª parte del codigo se ancarga de la mitad superior del rombo
		for (int i = 1; i <= num_filas; i++) {					//Este for se utiliza para controlar el número de filas del rombo
            for (int j = 1; j <= num_filas - i; j++) {			//Este bucle anidado se encarga de imprimir los espacios en blanco antes de los asteriscos.
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {				//Este otro bucle anidado se encarga de imprimir los asteriscos
                System.out.print("*");
            }
            System.out.println();								//Después de imprimir todos los espacios en blanco y asteriscos en una fila, se agrega un salto de línea
        }

        for (int i = num_filas - 1; i >= 1; i--) {
            for (int j = 1; j <= num_filas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}