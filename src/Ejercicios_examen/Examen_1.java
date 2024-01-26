package Ejercicios_examen;

import java.util.Scanner;

public class Examen_1 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);

        int[] array_int1 = new int[3];
        int[] array_int2 = new int[3];
        int[] array_nuevo = new int[3];
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;

        System.out.println("Ingrese los elementos del primer vector: ");
        for (int i = 0; i < array_int1.length; i++){
            array_int1[i] = lector.nextInt();
        }
        System.out.println("Ingrese los elementos del segundo vector: ");
        for (int i = 0; i < array_int2.length; i++) {
            array_int2[i] = lector.nextInt();
        }
        suma1 = array_int1[0] + array_int2[0];
        suma2 = array_int1[1] + array_int2[1];
        suma3 = array_int1[2] + array_int2[2];

        System.out.println("La sume de los vectores es: " );
        System.out.print(suma1 + " " + suma2 + " " + suma3);
    }
}
