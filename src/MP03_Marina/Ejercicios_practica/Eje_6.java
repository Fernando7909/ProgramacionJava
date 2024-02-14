package MP03_Marina.Ejercicios_practica;

import java.util.Scanner;
import java.util.Arrays;
public class Eje_6 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int longitud = 0;
        int elemento_eliminar = 0;
        int contador = 0;
        boolean medida1= false;
        boolean medida2= false;
        boolean medida3= false;

        System.out.println("Introduce la longitud del vector: ");
        while (!medida1){
            if(lector.hasNextInt()){
                longitud = lector.nextInt();
                medida1 = true;
            }
            else {
                System.out.println("ERROR! Has introducido un valor equivocado. Introduce un valor entero.");
                lector.next();
            }
        }
        System.out.println("Introduce los numeros para llenar el vector: ");
        int[] array_int =  new int[longitud];
        while (!medida2){
            for (int i = 0; i < longitud; i++){
                if (lector.hasNextInt()){
                    array_int[i] = lector.nextInt();
                    medida2 = true;
                }
                else{
                    System.out.println("ERROR! Introduce un valor entero.");
                    i--;
                    lector.next();
                }
            }
            System.out.println("El array original es: " + Arrays.toString(array_int));
        }
        System.out.println("Introduce un numero para eliminarlo del array: ");
        while (!medida3){
            if (lector.hasNextInt()){
                elemento_eliminar = lector.nextInt();
                medida3 = true;
            }
            else{
                System.out.println("ERROR! Introduce un numero que esté en el array.");
                lector.next();
            }
        }
        int[] new_array = new int[longitud - 1];
        for (int i = 0; i < array_int.length; i++){
            if(elemento_eliminar == array_int[i]){
                elemento_eliminar = array_int[i];
            }
            else {
                new_array[contador] = array_int[i];
                contador++;
            }
        }
        System.out.println("El nuevo array es: ");
        for (int i = 0; i < new_array.length; i++){
            System.out.print(new_array[i] + " ");
        }
    }
}
