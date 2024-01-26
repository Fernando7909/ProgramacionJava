/*15. Escriba un programa Java para encontrar elementos comunes entre dos matrices de enteros.*/

import java.util.Arrays;

public class Ejercicio_15{
	public static void main(String[] args){

		int[] array_int1 = {2, 14, 6, 8, 10};
		int[] array_int2 = {2, 5, 7, 8, 12, 14};

		System.out.println("El array_int1 inicialmente es: " + Arrays.toString(array_int1));
		System.out.println("El array_int2 inicialmente es: " + Arrays.toString(array_int2));

		for(int i = 0; i < array_int1.length; i++){
			for(int j = 0; j < array_int2.length; j++){

				if(array_int1[i] == array_int2[j]){
					System.out.println("El elemento comun entre los 2 arrays es: " + array_int1[i]);
				}
			}
		}
	}
}