/*4. Escriba un programa para calcular el valor promedio de los elementos de la matriz introduciendo los numeros mediante Scanner.
Salida de muestra
Matriz = {1, 2, 3, 4, 5}
Suma del valor de la matriz: 15
Promedio del valor de la matriz: 3,0*/

import java.util.Scanner;

public class Ejercicio_4{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int[] array_int = new int[5];
		int suma = 0;
		int promedio = 0;

		System.out.println("Introduce 5 numeros enteros: ");
		for(int i = array_int.length - 1; i >= 0; i--){
			array_int[i] = lector.nextInt();
		}
		for (int i = 0; i < array_int.length; i++) {
			suma = array_int[i] + suma;
		}
		promedio = suma / array_int.length;
		System.out.println("El valor promedio de los numeros introducidos es: " + promedio);
	}
}