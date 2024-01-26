package Ejercicios_examen;

import java.util.Scanner;

public class Examen_2 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int valor_buscar;
        boolean encontrado = false;

        System.out.println("Ingresa la longitud del vector: ");
        int longitud = lector.nextInt();
        int[] array_int = new int[longitud];

        System.out.println("Ingrese los elementos del vector: ");
        for (int i = 0; i < array_int.length; i++){
            array_int[i] = lector.nextInt();
        }
        System.out.println("Ingresa el valor a buscar: ");
        valor_buscar = lector.nextInt();

        for (int i = 0; i < array_int.length; i++) {
            if (valor_buscar == array_int[i]) {
                encontrado = true;
                System.out.println("El valor " + valor_buscar + " se encontro en la posicion " + i + " del vector");
                break;
            }
        }
        if (!encontrado){
            System.out.println("El valor " + valor_buscar + " no se encontro en el vector");
        }
    }
}
