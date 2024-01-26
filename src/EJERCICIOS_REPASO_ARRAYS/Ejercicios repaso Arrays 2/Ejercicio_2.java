/*2. Escriba un programa para ordenar matrices numéricas en orden descendente
Matriz = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}*/

/*
import java.util.Arrays;

public class Ejercicio_2{
	public static void main(String[] args){

		int[] array_int = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};

		Arrays.sort(array_int);

		System.out.println("El array ordenado de modo ASCENDENTE es: " + Arrays.toString(array_int));

		System.out.print("El array ordenado de modo DESCENDENTE es: [ ");
		for (int i = array_int.length - 1; i >= 0; i--) {
			System.out.print(array_int[i] + " ");
		}
		System.out.print("]");
	}
}
*/


import java.util.Arrays;
import java.util.Collections;

public class Ejercicio_2{
	public static void main(String[] args){

		Integer[] array_int = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};	//Hay que convetir el array de int a Integer

		Arrays.sort(array_int, Collections.reverseOrder());
		System.out.println("El array ordenado de modo DESCENDENTE es: " + Arrays.toString(array_int));
	}
}