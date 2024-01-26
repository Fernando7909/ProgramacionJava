/*28. Escribe un programa para encontrar los elementos comunes entre dos matrices de números enteros e imprimelos.*/

public class elementos_comunes{
	public static void main(String[] args){

		int[] array_int1 = {10, 20, 30, 50, 60, 70};
		int[] array_int2 = {10, 40, 50, 80, 70, 90};
		
		System.out.print("Los elementos comunes del array son: [ ");

		for(int i = 0; i < array_int1.length; i++){
			for(int j = 0; j < array_int2.length; j++){
				if(array_int1[i] == array_int2[j]){
					System.out.print(array_int1[i] + " ");
				}
			}
		}
		System.out.print("]");
	}
}