/*3. Escriba un programa para imprimir valores sumarios de una matriz introducidos mediante un Scanner.
Matriz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}*/

import java.util.Scanner;

public class Ejercicio_3{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int[] array_int = new int[10];
		int suma = 0;

		System.out.println("Introduce 10 numeros enteros: ");
		for(int i = 9; i >= 0; i--){
			array_int[i] = lector.nextInt();
		}
		for(int i = 0; i < array_int.length; i++){
			suma = array_int[i] + suma;
		}
		System.out.println("La suma de todos los numeros del array es: " + suma);
	}
}