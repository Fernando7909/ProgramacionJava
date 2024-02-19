/*8. Escriba un programa Java para copiar una matriz iterando la matriz.*/

import java.util.Arrays;

public class Ejercicio_8{
	public static void main(String[] args){

 		int[] array_int = {10, 11, 12, 13, 14, 15, 16, 17};
		int[] new_array_int = new int[8];

		System.out.println("El array inicialmente es: " + Arrays.toString(array_int));

		for(int i = 0; i < array_int.length; i++){
			new_array_int[i] = array_int[i];
		}
		System.out.println("El nuevo array copiado es: " + Arrays.toString(new_array_int));
	}
}

/*El metodo Arrays.toString se utiliza para convertir un Array en una cadena de texto.
 Esto convierte el array "array_int" a una cadena legible para humanos que muestra todos 
 los elementos del array entre corchetes y separados por comas.*/