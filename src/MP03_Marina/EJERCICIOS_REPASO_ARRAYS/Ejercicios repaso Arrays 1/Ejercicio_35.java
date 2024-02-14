/*35. Escriba un programa en Java para encontrar la suma de los dos elementos de una matriz, para que sea igual a un número entero dado.
Matriz de muestra: [1,2,4,5,6]
Valor objetivo: 6. */

public class Ejercicio_35{
	public static void main(String[] args){

		int[] array_int = {1,2,4,5,6};
		int valor_objetivo = 6;
		int suma = 0;

		for(int i = 0; i < array_int.length; i++){
			for(int j = 0; j < array_int.length; j++){
				suma = array_int[i] + array_int[j];
				
				if(suma == valor_objetivo){
					System.out.println("La suma del indice " + i + " y del indice " + j + " = 6");
				}
			}
		}
	}
}