/*Tome 10 entradas de números enteros del usuario y guárdelas en una matriz. Nuevamente solicite al usuario que proporcione un número. 
Ahora, dígale al usuario si ese número está presente en la matriz o no*/

import java.util.Scanner;

public class numero_presente{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int[] array_int = new int[10];
		int numero = 0;
		boolean encontrado = false;

		System.out.println("Introduce 10 numeros enteros: ");

		for(int i = 0; i < array_int.length; i++){
			array_int[i] = lector.nextInt();
		}
		System.out.print("El array inicialmente es: [ ");
		for(int j = 0; j < array_int.length; j++){
			System.out.print(array_int[j] + " ");
		}
		System.out.println("]");
		System.out.println("Inserta un numero con el fin de saber si esta en el array: ");

		numero = lector.nextInt();
		for(int k = 0; k < array_int.length; k++){
			if(numero == array_int[k]){
				System.out.println("El numero introducido esta en el array.");
				encontrado = true;
			}
		}
		if(!encontrado){
			System.out.println("El numero introducido NO esta en el array.");
		}
	}
}