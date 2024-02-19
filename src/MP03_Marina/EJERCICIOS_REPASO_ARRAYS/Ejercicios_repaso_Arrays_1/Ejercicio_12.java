/*12. Escriba un programa Java para encontrar valores duplicados en una matriz de valores enteros*/

import java.util.Arrays;

public class Ejercicio_12{
	public static void main(String[] args){

		int[] array_int = {1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 9};
		int contador = 0;

		System.out.println("El array inicialmente es: " + Arrays.toString(array_int));

		for(int i = 0; i < array_int.length; i++){
			for(int j = i + 1; j < array_int.length; j++){		// i + 1 para que no compare un numero consigo mismo

				if((array_int[i] == array_int[j]) && (i != j)){
					System.out.println("El numero duplicado es " + array_int[i]);
				}
			}
		}
	}
}