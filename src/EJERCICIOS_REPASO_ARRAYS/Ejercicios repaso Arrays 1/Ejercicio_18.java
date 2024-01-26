/*18. Escriba un programa Java para encontrar el segundo elemento más pequeño en una matriz.*/

import java.util.Arrays;

/*public class Ejercicio_18{
	public static void main(String[] args){

		int[] array_int = {-2, -1, 0, 1, 2, -3, -4};
		int min_2 = array_int[0];

		Arrays.sort(array_int);
		System.out.println("El array_int ordenado es: " + Arrays.toString(array_int));

		for (int i = 0; i < array_int.length; i++){
			if (min_2 > array_int[i]) {
				min_2 = array_int[i + 1];
			}
		}
		System.out.println("El 2º elemento mas pequeño del array_int es: " + min_2);
	}
}
*/

public class Ejercicio_18{
	public static void main(String[] args){

		int[] array_int = {-2, -1, 0, -4, 2, -3, 1};
		int min_2 = Integer.MAX_VALUE;

		for (int i = 0; i < array_int.length; i++) {
			if(array_int[i] < min_2){
				min_2 = array_int[i];
			}
		}
		System.out.println("El 2º elemento mas pequeño del array_int es: " + min_2);
	}
}
