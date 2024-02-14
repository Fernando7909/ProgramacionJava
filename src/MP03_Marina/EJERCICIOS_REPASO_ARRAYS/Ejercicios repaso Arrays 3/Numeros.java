/*3.
Tome 10 entradas de números enteros del usuario e imprima lo siguiente:
número de números positivos
número de números negativos
número de números impares
número de números pares
número de ceros.*/

import java.util.Scanner;

public class Numeros{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int[] array_int = new int[10];
		int numeros_positivos = 0;
		int numeros_negativos = 0;
		int cero = 0;
		int numeros_pares = 0;
		int numeros_impares = 0;

		System.out.println("Introduce 10 numeros que sean positivos, negativos, pares, impares y ceros");

		for(int i = 0; i < array_int.length; i++){
			array_int[i] = lector.nextInt();
		}	
		for(int j = 0; j < array_int.length; j++){
		
			if(array_int[j] > 0){
				numeros_positivos = array_int[j];
				System.out.println("El numero " + array_int[j] + " de la posicion: " + j + " es positivo.");
			}
			if(array_int[j] < 0){
				numeros_negativos = array_int[j];
				System.out.println("El numero " + array_int[j] + " de la posicion: " + j + " es negativo.");
			}
			if(array_int[j] == 0){
				cero = array_int[j];
				System.out.println("El numero " + array_int[j] + " de la posicion: " + j + " es cero.");
			}
			if(array_int[j] %2 == 0){
				numeros_pares = array_int[j];
				System.out.println("El numero " + array_int[j] + " de la posicion: " + j + " es par.");
			}
			else{
				numeros_impares = array_int[j];
				System.out.println("El numero " + array_int[j] + " de la posicion: " + j + " es impar.");
			}
		}
	}
}