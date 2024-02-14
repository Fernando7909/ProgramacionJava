package MP03_Marina.Ejercicios_practica;

import java.util.Scanner;
public class Eje_4 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        boolean Medida1 = false;
        boolean Medida2 = false;
        boolean Medida3 = false;
        boolean Medida4 = false;
        int longitud = 0;
        String palabra_buscar = " ";

        System.out.println("Introduce la longitud del vector: ");
        while (!Medida1){
            if (lector.hasNextInt()){
                longitud = lector.nextInt();
                Medida1 = true;
            }
            else{
                System.out.println("ERROR! Introduce un número entero.");
                lector.next();
            }
        }
        System.out.println("Introduce palabras hasta llenar el vector: ");
        String[] array_string = new String[longitud];
        lector.nextLine();

        while (!Medida2){
            for (int i = 0; i < array_string.length; i++){
                if (lector.hasNextLine()){
                    array_string[i] = lector.nextLine();
                    Medida2 = true;
                }
                else {
                    System.out.println("ERROR! Introduce una palabra.");
                    i--;
                    lector.next();
                }
            }
        }
        System.out.println("Introduce una palabra para verificar si está en el vector ");
        while (!Medida3){
            if (lector.hasNextLine()){
                palabra_buscar = lector.nextLine();
                Medida3 = true;
            }
            else{
                System.out.println("ERROR! Introduce una palabra.");
                lector.next();
            }
        }
        for (int i = 0; i < array_string.length; i++) {
            if (palabra_buscar.equalsIgnoreCase(array_string[i])) {
                System.out.println("La palabra " + palabra_buscar + " se encuentra en el vector en la posición " + i);
                Medida4 = true;
            }
        }
        if (!Medida4){
            System.out.println("La palabra " + palabra_buscar + " no se encuentra en el vector.");
        }
    }
}
