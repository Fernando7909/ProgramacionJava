package Ejercicios_examen;

/*1.
Tome 10 entradas de números enteros del usuario, guárdelas en una matriz
e imprímalas en la pantalla.*/

import java.util.Scanner;

public class repas_1 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int[] array_int = new int[10];

        System.out.println("Introduce 10 numeros enteros hasta llemar el array: ");
        for(int i = 0; i < array_int.length; i++){
            array_int[i] = lector.nextInt();
        }
        System.out.print("El array_int es: [ ");
        for (int j = 0; j < array_int.length; j++){
            System.out.print(array_int[j] + " ");
        }
        System.out.println("]");
    }
}
