package MP03_Marina.Ejercicios_practica;

import java.util.Scanner;
public class Eje_5 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int longitud = 0;
        boolean Medida1 = false;
        boolean Medida2 = false;
        int max = 0;
        int second_max = 0;

        System.out.println("Introduce la longitud del vector: ");
        while (!Medida1){
            if (lector.hasNextInt()){
                longitud = lector.nextInt();
                if (longitud > 0){
                    Medida1 = true;
                }
                else {
                    System.out.println("ERROR! Introduce un número positivo.");
                }
            }
            else{
                System.out.println("ERROR! Has introdroducido un valor equivocado. Introduce un número entero.");
                lector.next();
            }
        }
        System.out.println("Introduce numeros enteros hasta llenar el vector: ");
        int[] array_int = new int[longitud];
        while (!Medida2){
            for (int i = 0; i < longitud; i++){
                if (lector.hasNextInt()){
                    array_int[i] = lector.nextInt();
                    Medida2 = true;
                }
                else {
                    System.out.println("ERROR! Introduce un número entero.");
                    i--;
                    lector.next();
                }
            }
        }
        for (int i = 0; i < longitud; i++){
            if (max < array_int[i]){
                second_max = max;
                max = array_int[i];
            }
            else if (second_max < array_int[i]) {
                second_max = array_int[i];
            }
        }
        System.out.println("El numero mas grande del array es: " + max);
        System.out.println("El segundo numero mas grande del array es: " + second_max);
    }
}
