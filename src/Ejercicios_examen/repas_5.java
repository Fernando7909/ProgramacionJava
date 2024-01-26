package Ejercicios_examen;

/*5.
Escribe un programa para encontrar la suma y el producto de todos los elementos de una matriz.*/

import java.util.Scanner;

public class repas_5 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        float suma = 0;
        float producto = 1;

        System.out.println("Introduce un numero para determinar la medida del array: ");
        int medida = lector.nextInt();
        int[] array_int = new int[medida];

        System.out.println("Introduce numeros enteros hasta llenar el array: ");
        for (int i = 0; i < array_int.length; i++){
            array_int[i] = lector.nextInt();
            suma = suma + array_int[i];
            producto = array_int[i] * producto;
        }
        System.out.println("La suma de todos los numeros del array es: " + suma);
        System.out.println("El producto de todos los numeros del array es: " + producto);
    }
}
