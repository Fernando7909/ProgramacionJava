package Ejercicios_funciones;

import java.util.Scanner;
public class NumeroMasGrande {

    int[] array_int = new int[3];
    int Grande;

    public static void main(String[] args){

        NumeroMasGrande programa = new NumeroMasGrande();
        programa.inicio();
    }
    public void inicio(){

        mostrarMenu();
        array_int = introducirNumeros();
        Grande = numeroGrande(array_int);
        imprimir(Grande);


    }
    public void mostrarMenu(){

        System.out.println("\nBienvenido al programa NumeroMasGrande");
        System.out.println("--------------------------------------");
        System.out.println("Introduce 3 numeros enteros por la terminal para determinar\ncual es el más grande: ");
    }
    public int[] introducirNumeros(){

        Scanner lector = new Scanner(System.in);
        boolean completo = false;

        while (!completo){
            for (int i = 0; i < 3; i++){
                if (lector.hasNextInt()){
                    array_int[i] = lector.nextInt();
                    completo = true;
                }
                else{
                    System.out.println("ERROR! Has introducido un valor equivocado.");
                    /* Cuando se introduce algo que no es un numero y entra el "else", el i-- hace que no aumente
                    el valor de i y por lo tanto puedes seguir ingresando números hasta llenar el array*/
                    i--;
                    lector.next(); //Sin limpiar la salida, un error haria que entrase en bucle el programa
                }
            }
        }
        return array_int;
    }
    public int numeroGrande(int[] array_int){

        Grande = array_int[0];
        for (int i = 0; i < array_int.length; i++){
            if (Grande < array_int[i]){
                Grande = array_int[i];
            }
        }
        return Grande;
    }
    public void imprimir(int Grande){

        System.out.println("El numero mas grande de los 3 introducidos es: " + Grande);
    }
}
