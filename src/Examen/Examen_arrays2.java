package Examen;

import java.util.Scanner;
public class Examen_arrays2 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int Longitud = 0;
        boolean Medida = false;
        boolean Medida1 = false;
        boolean Medida2 = false;
        int numero_buscar = 0;


        System.out.println("Ingrese la longitud del vector: ");
        while (!Medida){
            if (lector.hasNextInt()){
                Longitud = lector.nextInt();
                Medida = true;
            }
            else {
                System.out.println("ERROR! Has introducido un valor equivocado.");
                lector.next();
            }
        }
        System.out.println("Ingrese los elementos del vector: ");
        int[] array_int = new int[Longitud];
        while (!Medida1){
            for (int i = 0; i < array_int.length; i++){
                if (lector.hasNextInt()){
                    array_int[i] = lector.nextInt();
                    Medida1 = true;
                    System.out.println("Elemento " + (i+1) + ": " + array_int[i]);
                }
                else {
                    System.out.println("ERROR! Has introducido un valor equivocado.");
                    i--;
                    lector.next();
                }
            }
        }
        System.out.println("Ingrese el valor a buscar: ");
        while (!Medida2){
            if (lector.hasNextInt()){
                numero_buscar = lector.nextInt();
                Medida2 = true;
            }
            else {
                System.out.println("ERROR! Has introducido un valor equivocado.");
                lector.next();
            }
        }
        for (int i = 0; i < array_int.length; i++){
            if (numero_buscar == array_int[i]){
                System.out.println("El valor " + array_int[i] + " se encontró en la posición " + i + " del vector");
            }
            else {
                System.out.println("El valor " + numero_buscar + " no se encontro en el vector.");
                break;
            }
        }
    }
}
