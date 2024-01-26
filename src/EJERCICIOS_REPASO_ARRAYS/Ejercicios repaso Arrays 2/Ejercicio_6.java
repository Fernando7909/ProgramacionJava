/*6. Escriba un programa en un tamaño de matriz para que sea ingresado por el usuario, imprímalo

Salida de muestra

Ingrese el límite de la matriz = 4
Elemento de a[0] = 10
Elemento de a[1] = 20
Elemento de a[2] = 30
Elemento de a[3] = 40*/

import java.util.Scanner;

public class Ejercicio_6{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);

		System.out.println("Introduce un numero entero para determinar la longitud del array: ");
		int l = lector.nextInt();
		int[] array_int = new int[l];

		System.out.println("Introduce la cantidad de numeros enteros correspondientes a la longitud del array: ");
		for (int i = 0; i < array_int.length; i++) {
			array_int[i] = lector.nextInt();
		}
		System.out.println("Los nuemros introducidon en el array son: ");
		for (int i = 0; i < array_int.length; i++) {
			System.out.println(array_int[i]);
		}
	}
}