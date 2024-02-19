/*9. Escriba un programa Java para insertar un elemento (posición específica) en una matriz.*/
package MP03_Marina.EJERCICIOS_REPASO_ARRAYS.Ejercicios_repaso_Arrays_1;

import java.util.Arrays;

public class Ejercicio_9{
	public static void main(String[] args){

		int[] array_int = {5, 10, 15, 20, 30, 35, 40, 45};
		int[] new_array_int = new int[array_int.length + 1];

		int posicion = 4;
		int numero = 25;

		System.out.println("El array_int inicialmente es: " + Arrays.toString(array_int));

		/*En el 1º bucle copiamos los numeros previos al nuevo numero que vamos a insertar del array_int.
		Asi llenamos la primera parte del new_array_int*/

		for(int i = 0; i < posicion; i++){
			new_array_int[i] = array_int[i];
		}
		// Insertamos el nuevo numero en su posicion

		new_array_int[posicion] = numero;

		/*En el 2º bucle copiamos los numeros posteriores al nuevo numero que hemos insetado del array_int.
		Asi llenamos la segunda parte del new_array_int*/

		for(int i = posicion + 1; i < new_array_int.length; i++){
			new_array_int[i] = array_int[i - 1];
		}
		System.out.println("El nuevo Array es: " + Arrays.toString(new_array_int));
	}
}