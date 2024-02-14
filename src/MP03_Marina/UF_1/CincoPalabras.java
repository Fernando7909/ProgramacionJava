package UF_1;

import java.util.Scanner;

public class CincoPalabras{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		String[] array_palabras = new String[5];

		System.out.println("Escribe 5 palabras: ");

		for(int i = 0; i < array_palabras.length; i++){
			array_palabras[i] = lector.nextLine();
		}
		for(int j = 0; j < array_palabras.length; j++){
			System.out.println("La palabra de la posicion " + j + " es " + array_palabras[j]);
		}
	}
}