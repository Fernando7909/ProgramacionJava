/*4. Escriba un programa Java para calcular el valor promedio de los elementos de una matriz.*/

public class Ej_4{
	public static void main(String[] args){

		int[] array_int = {1,2,3,4,5,6,7,8,9};
		int suma = 0;
		int resultado = 0;

		for(int i = 0; i < array_int.length; i++){
			suma = suma + array_int[i];
		}
		resultado = suma / array_int.length;
		System.out.println("El valor primedio del array_int es: " + resultado);
	}
}