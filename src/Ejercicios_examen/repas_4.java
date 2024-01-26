package Ejercicios_examen;

/*4.
Tome 10 entradas de números enteros del usuario y guárdelas en una matriz.
Ahora, copie todos los elementos en otra matriz pero en orden inverso.*/

import java.util.Scanner;

public class repas_4 {
    public static void main(String[] args){

       Scanner lector = new Scanner(System.in);
       int[] array_int = new int[10];
       int[] array_reverse = new int[10];

       System.out.println("Introduce 10 numeros enteros para llenar el array: ");
       for (int i = 0; i < array_int.length; i++){
           array_int[i] = lector.nextInt();
       }
       for (int i = array_int.length - 1; i >= 0; i--){
           System.out.println(array_int[i]);
       }
    }
}
