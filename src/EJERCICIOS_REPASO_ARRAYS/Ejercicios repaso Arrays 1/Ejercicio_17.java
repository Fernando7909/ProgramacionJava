/*17. Escribe un programa en java para buscar el segundo elemento mas grande de un array*/

import java.util.Arrays;					//importamos la clase Arrays(para poder ordenar el array)

public class Ejercicio_17{
	public static void main(String[] args){

		int[] array_int = {20,40,55,69,99,58,76,35,125};
		System.out.println("Busquemos el segundo elemento mas grande del array.\nEl array originalmente es: ");

		for(int i = 0; i < array_int.length; i++){
			System.out.print(array_int[i] + " ");
		}
		Arrays.sort(array_int);			//Arrays.sort() es para ordenar el array en orden ascendente.
		int j = array_int.length - 2;
		System.out.println("\nEl segundo elemento mas grande del array es: " + array_int[j]);
	}
}