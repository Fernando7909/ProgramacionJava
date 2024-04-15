package MP03_Marina.Ejercicios_practica;

import java.util.Scanner;

public class Eje_1 {
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		boolean Medida1 = false;
		boolean Medida2 = false;
		int longitud = 0;

		System.out.println("Introduce la medida del vector: ");

		while (!Medida1){
			if(lector.hasNextInt()){
				longitud = lector.nextInt();
				Medida1 = true;
			}
			else{
				System.out.println("ERROR! Introduce un numeros entero.");
				lector.next();
			}
		}
		int[] array_int = new int[longitud];
		System.out.println("Introduce los valores del vector: ");

		while (!Medida2){
			for (int i = 0; i < array_int.length; i++){
				if (lector.hasNextInt()){
					array_int[i] = lector.nextInt();
					Medida2 = true;
				}
				else{
					System.out.println("ERROR, introduce un numero entero.");
					i--;
					lector.next();
				}
			}
		}
		int Max = array_int[0];
		int Min = array_int[0];
		double Mediana = 0;
		int suma = 0;

		for (int i = 0; i < array_int.length; i++){
			if (Max < array_int[i]){
				Max = array_int[i];
			}
			if (Min > array_int[i]){
				Min = array_int[i];
			}
			suma = suma + array_int[i];
			Mediana = suma / array_int.length;
		}
		System.out.println("El valor maximo del array es: " + Max);
		System.out.println("El valor minimo del array es: " + Min);
		System.out.println("LA mediana de los valores del array es: " + Mediana);
	}
}