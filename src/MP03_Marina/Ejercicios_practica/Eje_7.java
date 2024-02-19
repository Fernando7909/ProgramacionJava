package MP03_Marina.Ejercicios_practica;

import java.util.Scanner;
public class Eje_7 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        boolean medida1 = false;
        boolean medida2 = false;
        int longitud = 0;

        System.out.println("Introduce la medida del vector: ");
        while (!medida1){
            if (lector.hasNextInt()){
                longitud = lector.nextInt();
                if (longitud > 0){
                    medida1 = true;
                }
                else{
                    System.out.println("Introduce un valor positivo.");
                }
            }
            else{
                System.out.println("ERROR! Introduce un valor entero positivo");
                lector.next();
            }
        }
        System.out.println("Introduce numeros hasta llenar el vector: ");
        int[] array_int = new int[longitud];
        while (!medida2){
            for (int i = 0; i < longitud; i++){
                if (lector.hasNextInt()){
                    array_int[i] = lector.nextInt();
                    medida2 = true;
                }
                else {
                    System.out.println("ERROR! Introduce un numero.");
                    i--;
                    lector.next();
                }
            }
        }
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.print("El array1 es: ");
        for (int i = 0; i < array1.length; i++){
            array1[i] = array_int[i];
            System.out.print(array1[i] + " ");
        }
        System.out.print("\nEl array2 es: ");
        for (int j = 0; j < array2.length; j++){
            array2[j] = array_int[j + array2.length];
            System.out.print(array2[j] + " ");
        }
    }
}
