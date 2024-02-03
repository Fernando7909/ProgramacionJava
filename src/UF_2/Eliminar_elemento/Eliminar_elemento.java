package UF_2.Eliminar_elemento;

import java.util.Scanner;

public class Eliminar_elemento {
	Scanner lector = new Scanner(System.in);
	int Longitud;
	int[] array_int;
	int[] new_array;
	int input_int;
	int contador;

	public static void main(String[] args) {

		Eliminar_elemento programa = new Eliminar_elemento();
		programa.inicio();
	}
	public void inicio() {
		Longitud = Longitud_Vector();
		array_int = Llenar_Vector(Longitud);
		input_int = numero_Eliminar();
		contador = eliminar_elemento(array_int, input_int);
		imprimir(contador, new_array);
	}
	public int Longitud_Vector() {

		boolean Medida = false;
		System.out.println("Introduce la medida del array: ");
		while (!Medida) {
			if (lector.hasNextInt()) {
				Longitud = lector.nextInt();
				array_int = new int[Longitud];
				Medida = true;
			}
			else {
				System.out.println("ERROR! Has introducido un valor equivocado");
				lector.next();
			}
		}
		return Longitud;
	}
	public int[] Llenar_Vector(int Longitud) {

		boolean Medida2 = false;
		System.out.println("Introduce los numeros para llenar el array_int: ");
		while (!Medida2) {
			if (lector.hasNextInt()) {
				for (int i = 0; i < Longitud; i++) {
					array_int[i] = lector.nextInt();
				}
				Medida2 = true;
			}
			else {
				System.out.println("ERROR! Has introducido un valor equivocado");
				lector.next();
			}
		}
		return array_int;
	}
	public int numero_Eliminar() {

		boolean Eliminar = false;
		System.out.println("Introduce el numero del elemento que deseas eliminar del array:");

		while (!Eliminar){
			if (lector.hasNextInt()){
				input_int = lector.nextInt();
				Eliminar = true;
			}
			else {
				System.out.println("ERROR!! Has introducido un valor equivocado.");
				lector.next();
			}
		}
		return input_int;
	}

	public int eliminar_elemento(int[] array_int, int input_int) {

		new_array = new int[array_int.length - 1];
		boolean encontrado = false;
		int contador = 0;

		for (int i = 0; i < array_int.length; i++) {
			if (input_int == array_int[i]) {
				encontrado = true;
			}
			else {
				new_array[contador] = array_int[i];
				contador++;
			}
		}
		if (!encontrado) {
			System.out.println("Elemento no encontrado en el array");
		}
		return contador;
	}
	public void imprimir(int contador, int[] new_array) {

		System.out.println("Elemento eliminado. El nuevo array es: ");
		for (int j = 0; j < contador; j++) {
			System.out.print(new_array[j] + " ");
		}
	}
}
