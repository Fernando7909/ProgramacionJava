package Ejercicios_examen;

import java.util.Scanner;
/*2.
Tome 10 entradas de números enteros del usuario y guárdelas en una matriz.
Nuevamente solicite al usuario que proporcione un número. Ahora, dígale al usuario
si ese número está presente en la matriz o no.*/


public class repas_2 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int[] array_int = new int[10];
        int numero = 0;
        boolean encontrado = false;

        System.out.println("Introduce 10 numeros enteros para llenar el array: ");
        for(int i = 0; i < array_int.length; i++){
            array_int[i] = lector.nextInt();
        }
        System.out.println("Introduce un numero para ver si esta en el array: ");
        numero = lector.nextInt();

        for (int j = 0; j < array_int.length; j++){
            if (numero == array_int[j]){
                System.out.println("El numero introducido esta en el array!!");
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("El numero introducido no esta en el array!");
        }
    }
}
