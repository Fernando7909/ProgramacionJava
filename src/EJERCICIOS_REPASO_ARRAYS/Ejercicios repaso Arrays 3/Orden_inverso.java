/*4.
Tome 10 entradas de números enteros del usuario y guárdelas en una matriz. Ahora, 
copie todos los elementos en otra matriz pero en orden inverso.*/

import java.util.Scanner;

public class Orden_inverso{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int[] array_int = new int[6];


		System.out.println("Introduce 6 numeros enteros: ");

		for(int i = 0; i < array_int.length; i++){
			if(lector.hasNextInt()){
				array_int[i] = lector.nextInt();
			}
			else{
				System.out.println("ERROR!");
			}
		}
		System.out.print("El array invertido es [ ");
		for(int k = array_int.length - 1; k >= 0; k--){
			System.out.print(array_int[k] + " ");
		}
		System.out.print("]");
	}
}