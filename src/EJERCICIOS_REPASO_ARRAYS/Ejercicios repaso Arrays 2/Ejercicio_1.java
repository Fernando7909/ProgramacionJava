/*1. Escriba un programa para ordenar matrices numéricas en orden ascendente
Matriz = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}*/

import java.util.Arrays;

public class Ejercicio_1{
	public static void main(String[] args){

		int[] array_int = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};

		Arrays.sort(array_int);

		System.out.println("El array ordenado de modo ascendente es: " + Arrays.toString(array_int));
	}
}