/*7. Escriba un programa para encontrar la suma de todos los elementos de la matriz.*/

import java.util.Scanner;

public class Ej_7 {
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int suma = 0;

		System.out.println("Introduce un numero para determinar la longitud del array: ");
		int l = lector.nextInt();
		int[] array_int = new int[l];

		System.out.println("Introduce los numeros enteros correspondinetes a la longitud del array: ");
		for (int i = 0; i < array_int.length; i++) {
			suma = suma + lector.nextInt();
		}
		System.out.println("La suma de todos los elementos del array es: " + suma);
	}
}