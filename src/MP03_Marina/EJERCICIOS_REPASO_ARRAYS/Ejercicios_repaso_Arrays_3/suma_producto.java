/*Escribe un programa para encontrar la suma y el producto de todos los elementos de una matriz.*/

public class suma_producto{
	public static void main(String[] args){

		int[] array_int = {2,2,3,4,2,1};
		int suma = 0;
		int producto = 1;

		for(int i = 0; i < array_int.length; i++){
			suma = suma + array_int[i];
			producto = producto * array_int[i];
		}
		System.out.println("La suma total de cada elemento del array es: " + suma);
		System.out.println("El producto de todos los elemento del array es: " + producto);
	}
}