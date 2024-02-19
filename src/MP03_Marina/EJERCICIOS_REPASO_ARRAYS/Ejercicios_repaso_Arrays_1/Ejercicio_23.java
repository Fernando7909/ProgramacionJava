/*23. Escriba un programa Java para probar la igualdad de dos matrices.*/

public class Ejercicio_23{
	public static void main(String[] args){

		int[] arrai_int1 = {2, 4, 6, 8, 10};
		int[] arrai_int2 = {2, 4, 6, 8, 10};
		boolean elementos_iguales = true;

		if(arrai_int1.length == arrai_int2.length){
			System.out.println("Ambos arrays tienen la misma longitud.");

			for (int i = 0; i < arrai_int2.length; i++) {		//Aqui se itera sobre ambos arrays
				if (arrai_int1[i] == arrai_int2[i]) {
					elementos_iguales = true;
				}
				else{
					elementos_iguales = false;
				}
			}
			if(!elementos_iguales){
				System.out.println("Ambos arrays tienen elementos DIFERENTES.");
			}
			else{
				System.out.println("Ambos arrays tienen los mismos elementos.");
			}
		}
		else{
			System.out.println("Los arrays tienen longitudes diferentes.");
		}
	}
}