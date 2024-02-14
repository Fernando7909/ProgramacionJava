/*2. Escriba un programa Java para sumar valores de una matriz.*/

/*public class Ejercicio_2{
	public static void main(String[] args){

		int[] array_int = {1,2,3,4,5,6,7,8,9,10};
		int suma = 0;

		System.out.println("La suma del array es: ");
		for(int i : array_int){
			suma = suma + i;
		}
		System.out.print(suma);
	}
}*/


public class Ej_2 {
	public static void main(String[] args){

		int[] array_int = {1,2,3,4,5,6,7,8,9,10};
		int suma = 0;

		System.out.println("La suma del array es: ");
		for(int i = 0; i < array_int.length; i++){
			suma = suma + array_int[i];
		}
		System.out.print(suma);
	}
}
