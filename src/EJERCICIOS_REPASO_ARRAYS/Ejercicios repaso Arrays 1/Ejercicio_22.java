/*22. Escriba un programa Java para encontrar todos los pares de elementos en una matriz cuya suma sea igual a un número específico*/

public class Ejercicio_22{
	public static void main(String[] args){

		int[] arrai_int = {2, 7, 4, -5, 11, 5, 20};
		int numero = 15;

		for (int i = 0; i < arrai_int.length; i++) {
			for (int j = i + 1; j < arrai_int.length; j++) {
				
				if(arrai_int[i] + arrai_int[j] == 15){
					System.out.println("Los numeros " + arrai_int[i] + " y " + arrai_int[j] + " suman 15.");
				}
			}
		}
	}
}

/*Al poner i + 1 en el segundo bucle, evitamos la comparacion con 
elementos previos y eliminamos los duplicados en orden inverso.*/