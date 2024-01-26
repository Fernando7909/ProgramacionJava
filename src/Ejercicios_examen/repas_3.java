package Ejercicios_examen;

/*3.
Tome 15 entradas de números enteros del usuario e imprima lo siguiente:
número de números positivos
número de números negativos
número de números impares
número de números pares
número de ceros.*/

import java.util.Scanner;

public class repas_3 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int[] array_int = new int[15];
        int positivos = 0;
        int negativos = 0;
        int impares = 0;
        int pares = 0;
        int ceros = 0;

        System.out.println("Introduce 15 numeros enteros: ");
        for (int i = 0 ; i < array_int.length; i++){
            array_int[i] = lector.nextInt();
        }
        for (int j = 0; j < array_int.length; j++){
            if (array_int[j] > 0){
                positivos++;
            } if (array_int[j] < 0) {
                negativos++;
            } if (array_int[j] %2 == 1) {
                impares++;
            } if (array_int[j] %2 == 0) {
                pares++;
            } if (array_int[j] == 0) {
                ceros++;
            }
        }
        System.out.println("En el array hay " + positivos + " numeros positivos." );
        System.out.println(negativos + " numeros negativos." );
        System.out.println(impares + " numeros impares." );
        System.out.println(pares + " numeros pares." );
        System.out.println(ceros + " numeros cero." );
    }
}
