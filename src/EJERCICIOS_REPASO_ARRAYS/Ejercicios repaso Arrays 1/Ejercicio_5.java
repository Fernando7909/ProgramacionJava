/*5. Escribe un programa en java para verificar si el array contiene un valor especifico*/

import java.util.Scanner;

public class Ejercicio_5{
	public static void main(String[] args){

		int[] array_int = {1,2,3,4,5,6,7,8,9,10};
		Scanner lector = new Scanner(System.in);
		int imput_number = 0;
		boolean encontrado = false;

		System.out.println("Introduce un numero para verificar si esta en el array: ");

		if(lector.hasNextInt()){
			imput_number = lector.nextInt();

			for(int i = 0; i < array_int.length; i++){
				if(imput_number == array_int[i]){
					System.out.println("CORRECTO!! El array contiene el numero introducido!");
					encontrado = true;
				}
			}
			if(!encontrado){
				System.out.println("El array NO contiene el numero introducido.");
			} 
		}
		else{
			System.out.println("ERROR! Has introducido un valor equivocado.");
		}
	}
}