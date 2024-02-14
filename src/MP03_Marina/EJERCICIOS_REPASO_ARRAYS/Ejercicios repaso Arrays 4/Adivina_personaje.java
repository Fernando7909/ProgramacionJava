/*Adivina el personaje
Escribe un programa que cree un ArrayList de caracteres (elige tantos como quieras).

Ahora permita que el usuario ingrese caracteres para adivinar qué caracteres están en la lista de matrices.

Permítale continuar adivinando hasta que haya ingresado todos los caracteres de la lista (punto extra: imprima al final cuantos intentos hizo).*/

import java.util.Scanner;

public class Adivina_personaje {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        char[] array_char = {'a', 'e', 'i'};
        int contador = 0;
        int intentos = 0;

        System.out.println("Introduce caracteres hasta adivinar el array_char: ");

        while (contador < array_char.length) {
            char char_introducido = lector.next().charAt(0);
            intentos++;

            for (int j = 0; j < array_char.length; j++) {
                if (char_introducido == array_char[j]) {
                    if (array_char[j] != ' ') {
                        contador++;
                        array_char[j] = ' ';                // Marca el carácter como adivinado usando espacio en blanco
                        System.out.println("Has acertado. Sigue intentándolo hasta adivinar todos los caracteres.");
                    } 
                }
            }
            if (contador < array_char.length) {
                System.out.println("No lo has acertado completamente. Sigue intentandolo.");
            }
        }     
        System.out.println("¡Felicidades! Has adivinado todos los caracteres en " + intentos + " intentos.");
    }
}

