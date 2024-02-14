package MP03_Marina.Examen;

import java.util.Scanner;
public class Examen_arrays1 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int Longitud = 0;
        boolean lleno = false;
        boolean lleno1 = false;
        boolean lleno2 = false;

        System.out.println("Ingresa la longitud de los vectores: ");
        while (!lleno){
            if (lector.hasNextInt()){
                Longitud = lector.nextInt();
                lleno = true;
            }
            else {
                System.out.println("ERROR! Has introducido un valor equivocado.");
                lector.next();
            }
        }
        int[] array1 = new int[Longitud];
        System.out.println("Ingrese los elementos del primer vector: ");
        while (!lleno1){
            for (int i = 0; i < Longitud; i++){
                if (lector.hasNextInt()){
                    array1[i] = lector.nextInt();
                    System.out.println("Elemento " + (i+1) + ": " + array1[i]);
                    lleno1 = true;
                }
                else {
                    System.out.println("ERROR! Has introducido un valor equivocado.");
                    i--;
                    lector.next();
                }
            }
        }
        int[] array2 = new int[Longitud];
        System.out.println("Ingrese los elementos del segundo vector: ");
        while (!lleno2){
            for (int i = 0; i < array2.length; i++){
                if (lector.hasNextInt()){
                    array2[i] = lector.nextInt();
                    System.out.println("Elemento " + (i+1) + ": " + array2[i]);
                    lleno2 = true;
                }
                else {
                    System.out.println("ERROR! Has introducido un valor equivocado.");
                    i--;
                    lector.next();
                }
            }
        }
        int[] new_array = new int[Longitud];
        System.out.println("La suma de los vectores es: ");
        for (int i = 0; i < new_array.length; i++){
            new_array[i] = array1[i] + array2[i];
            System.out.print(new_array[i] + " ");
        }
    }
}
