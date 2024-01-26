/*17. Escriba un programa para fusionar dos elementos de una matriz para almacenarlos en una tercera matriz.*/

public class Fusionar_arrays{
	public static void main(String[] args){

		int[] array_int1 = {1,2,3,4,5};
		int[] array_int2 = {6,7,8,9,10};
		int[] nuevo_array = new int[10];


		for(int i = 0; i < array_int1.length; i++){
			nuevo_array[i] = array_int1[i];							// Almacenamos el array_int1 en las primeras 5 celdas del nuevo_array
		}
		for(int j = 0; j < array_int2.length; j++){
			nuevo_array[array_int1.length + j] = array_int2[j];		// Alamcenamos el array_int2 a partir de la 6º celda del nuevo array
		}
		System.out.print("El nuevo array fusionado es: [ ");
		for(int k = 0; k < nuevo_array.length; k++){
			System.out.print(nuevo_array[k] + " ");
		}
		System.out.println("]");
	}
}