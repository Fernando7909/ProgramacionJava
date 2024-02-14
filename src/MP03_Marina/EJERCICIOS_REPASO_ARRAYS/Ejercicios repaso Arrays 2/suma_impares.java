/*13. Escriba un programa para imprimir la suma de números impares de na matriz*/

import java.util.Scanner;

public class suma_impares{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int[] array_int = new int[6];
		int suma = 0;

		System.out.println("Introduce 6 numeros pares e impares para realozar la suma de los impares: ");

		for(int i = 0; i < array_int.length; i++){
			array_int[i] = lector.nextInt();

			if(array_int[i] %2 == 1){
				suma = suma + array_int[i];
			}
		}
		System.out.println("La suma de los numeros impares del array es: " + suma);
	}
}