/*5. Escriba un programa para almacenar elementos en una matriz e imprimirlo.

Salida de muestra

Tamaño de matriz = 5
Elemento de a[0] = 5
Elemento de a[1] = 11
Elemento de a[2] = 22
Elemento de a[3] = 33
Elemento de a[4] = 44*/

import java.util.Scanner;

public class Ej_5 {
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int[] array_int = new int[7];

		System.out.println("Introduce 7 numeros enteros para rellenar el array: ");

		for (int i = array_int.length - 1; i >= 0; i--) {
			array_int[i] = lector.nextInt();
		}
		System.out.println("Los numeros del array_int son: ");
		for (int i = array_int.length - 1; i >= 0; i--) {
			System.out.println(array_int[i]);
		}
	}
}