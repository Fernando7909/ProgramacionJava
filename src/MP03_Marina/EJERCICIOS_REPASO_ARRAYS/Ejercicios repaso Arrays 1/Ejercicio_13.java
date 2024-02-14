/*13. Escriba un programa Java para encontrar valores duplicados en una matriz de valores de cadena.*/

import java.util.Arrays;

public class Ejercicio_13{
	public static void main(String[] args){

		String[] array_string = {"perro", "gato", "mono", "mono", "pajaro", "perro"};

		System.out.println("El array inicialmente es: " + Arrays.toString(array_string));

		for(int i = 0; i < array_string.length; i++){
			for(int j = i + 1; j < array_string.length; j++){

				if((array_string[i].equalsIgnoreCase(array_string[j])) && (i != j)){
					System.out.println("El valor " + array_string[i] + " está duplicado.");
				}
			}
		}
	}
}