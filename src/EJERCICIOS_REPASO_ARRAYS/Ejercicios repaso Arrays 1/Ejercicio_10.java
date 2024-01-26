/*10. Escriba un programa Java para encontrar el valor máximo y mínimo de una matriz.*/

import java.util.Arrays;

public class Ejercicio_10{
	public static void main(String[] args){

		int[] array_int = {5, 10, 15, 20, 25, 30, 65, 3, 55};
		int Valor_max = array_int[0];
		int Valor_min = array_int[0];

		System.out.println("El Array inicialmente es: " + Arrays.toString(array_int));

		for(int i = 0; i < array_int.length; i++){
			if(Valor_max < array_int[i]){
				Valor_max = array_int[i];
			}
			else if (Valor_min > array_int[i]) {
				Valor_min = array_int[i];
			}
		}
		System.out.println("El valor maximo del Array es: " + Valor_max);
		System.out.println("El valor minimo del Array es: " + Valor_min);
	}
}