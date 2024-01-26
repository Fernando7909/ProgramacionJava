/*1. Escriba un programa Java para ordenar una matriz numérica y una matriz de cadenas.*/

import java.util.Arrays;

public class Ej_1 {
	public static void main(String[] args){

		int[] array_int = {2,4,6,9,74,5,25,31,45,96,75};
		String[] array_string = {"java", "python", "kotlin", "go", "php"};

		Arrays.sort(array_int);
		Arrays.sort(array_string);

		System.out.println("El array_int ordenado es: ");
		for(int i = 0; i < array_int.length; i++){
			System.out.print(array_int[i] + " ");
		}
		System.out.println("\nEl array_string ordenado es: ");
		for(int j = 0; j < array_string.length; j++){
			System.out.print(array_string[j] + " ");
		}
	}
}