/*Eliminar palabras demasiado cortas
Permita que el usuario elija cuántas palabras desea ingresar
Lee tantas palabras
Permitir que el usuario elija un número mayor que 0
Elimine todas las palabras de ArrayList que sean más cortas que el número dado*/

import java.util.Scanner;

public class Eliminar_palabras{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int numero = 0;
		String palabra;

		System.out.println("Ingresa el numero de palabras que quieras ingresar: ");

		numero = lector.nextInt();
		String[] array_string = new String[numero];
		lector.nextLine();							//Esta linea de codigo elimina el salto de linea pendiente, ya que si no lo pongo
													//me dejaria introducir una palabra menos del numero introducido
		System.out.println("ingresa el numero de palabras correcpondiente al numero introducido: ");

		for(int i = 0; i < array_string.length; i++){
			array_string[i] = lector.nextLine();
		}
		System.out.println("Las palabras finalmente son: ");
		for(int j = 0; j < array_string.length; j++){
			if(array_string[j].length() >= numero)			//length() con parentesis se usa para Strings
			System.out.println(array_string[j]);
		}		
	}
}