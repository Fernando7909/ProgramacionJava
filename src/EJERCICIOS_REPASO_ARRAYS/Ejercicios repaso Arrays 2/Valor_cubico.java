/*9. Escriba un programa para elementos de matriz para imprimir valores cúbicos.*/

import java.util.Scanner;

public class Valor_cubico{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int[] array_int = new int[5];

		System.out.println("Introduce 5 numeros para calcucal su valor cubico.");

		for(int i = 0; i < array_int.length; i++){
			array_int[i] = lector.nextInt();
		}
		for(int i = 0; i < array_int.length; i++){
			System.out.println("El valor cubico de " + array_int[i] + " es " + Math.pow(array_int[i], 3));
		}		
	}
}