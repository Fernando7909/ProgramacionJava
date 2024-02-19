/*6. Escriba un programa Java para encontrar el índice de un elemento de matriz.*/

import java.util.Scanner;

public class Ej_6 {
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int[] array_int = {10,20,30,40,50,60,70,80,90};
		int numero_introducido = 0;
		boolean encontrado = false;

		System.out.println("Introduce un numero del array para encontrar su indice: ");

		if(lector.hasNextInt()){
			numero_introducido = lector.nextInt();

			for(int i = 0; i < array_int.length; i++){
				if(numero_introducido == array_int[i]){
					System.out.println("El numero de indice del valor introducido es: " + i);
					encontrado = true;
				}
			}
			if(!encontrado){
				System.out.println("ERROR! Este numero no esta en el array.");
			}
		}
		else{
			System.out.println("ERROR! Has introducido un valor erroneo.");
		}
	}
}