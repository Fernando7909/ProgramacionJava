package MP03_Marina.Ejercicios_practica;

import java.util.Scanner;
public class Eje_2 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int longitud = 0;
        boolean medida = false;
        boolean medida2 = false;

        System.out.println("Introduce la medida del vector: ");
        while (!medida){
            if (lector.hasNextInt()){
                longitud = lector.nextInt();
                medida = true;
            }
            else{
                System.out.println("ERROR! Introduce un número entero.");
                lector.next();
            }
        }
        String[] array_string = new String[longitud];
        System.out.println("Introduce palabras para llenar el vector: ");
        lector.nextLine();

        while (!medida2){
            for (int i = 0; i < array_string.length; i++){
                if (lector.hasNextLine()){
                    array_string[i] = lector.nextLine();
                }
                else{
                    System.out.println("ERROR! introduce un string.");
                    i--;
                    lector.next();
                }
            }
            medida2 = true;
        }
        System.out.println("Las palabras del array_string son: ");
        for (int i = 0; i < array_string.length; i++){
            System.out.print(array_string[i] + " ");
        }
    }
}
