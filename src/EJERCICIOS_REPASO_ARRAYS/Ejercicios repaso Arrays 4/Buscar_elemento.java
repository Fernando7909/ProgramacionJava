/*Encontrar elementos
Implemente un método que encuentre la posición del String dentro de an ArrayList<String>. 
Devolverá la posición del elemento (donde 0 significa el primer elemento, 1 el segundo, y así sucesivamente). 
En caso de que el elemento buscado no esté presente en el método ArrayList, el método devolverá -1*/

import java.util.Scanner;

public class Buscar_elemento{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		String[] array_string = {"lampara", "mesa", "escritorio", "armario", "silla", "taburete"};
		String palabra_introducida;
		boolean encontrada = false;

		System.out.println("Adivina una de las palabras del Array: ");

		palabra_introducida = lector.nextLine();
		for(int i = 0; i < array_string.length; i++){
			if(array_string[i].equalsIgnoreCase(palabra_introducida)){
				System.out.println("La posicion de la palabra introducida es: " + i);
				encontrada = true;
			}
		}
		if(!encontrada){
			System.out.println("-1");
		}
	}
}