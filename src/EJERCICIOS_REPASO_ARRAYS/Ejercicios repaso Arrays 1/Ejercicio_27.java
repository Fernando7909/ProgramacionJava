/*27. Escriba un programa Java para encontrar el número de enteros pares e impares en una matriz dada de enteros*/

public class Ejercicio_27{
	public static void main(String[] args){

		int[] array_int = {11,12,13,14,15,16,17,18,19,20};

		for(int i = 0; i < array_int.length; i++){
			if(array_int[i] %2 == 0){
				System.out.println("El numero " + array_int[i] + " del array es par.");
			}
			else{
				System.out.println("El numero " + array_int[i] + " del array es impar");
			}
		}
	}
}