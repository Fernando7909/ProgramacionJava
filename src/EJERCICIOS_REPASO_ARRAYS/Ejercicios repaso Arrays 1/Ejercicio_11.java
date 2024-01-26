/*11. Escriba un programa Java para invertir una matriz de valores enteros.*/

import java.util.Arrays;

public class Ejercicio_11{
	public static void main(String[] args){

		int[] array_int = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		System.out.println("El array inicialmente es: " + Arrays.toString(array_int));

		System.out.print("El array invertido es: [ ");
		for(int i = array_int.length - 1; i >= 0; i--){
			System.out.print(array_int[i] + " ");
		}
		System.out.print(" ]");
	}
}