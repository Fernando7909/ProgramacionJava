/*16. Escriba un programa Java para eliminar elementos duplicados de una matriz y crear una nueva.*/

import java.util.Arrays;

public class Ejercicio_16 {
    public static void main(String[] args) {

        int[] array_int = {10, 20, 20, 40, 50, 60, 30, 40};
        int[] new_array = new int[array_int.length];
        int longitud = 0;

        for (int i = 0; i < array_int.length; i++) {
            boolean esDuplicado = false;

            /* "esDuplicado" se coloca dentro del bucle for externo, y se reinicializa a false 
            al comienzo de cada iteración del bucle externo (para cada valor de i)*/

            for (int j = 0; j < longitud; j++) {
                if (array_int[i] == new_array[j]) {
                    esDuplicado = true;
                    break;
                }
            }
            /* La variable [longitud] se utiliza como un índice para controlar la posicion
            en la que se insertarán los elementos únicos en el array new_array. */

            if (!esDuplicado) {
                new_array[longitud] = array_int[i];
                longitud++;
            }
        }

        // Crear un nuevo array con la longitud correcta
        int[] resultado = Arrays.copyOf(new_array, longitud);

        System.out.println("Array original: " + Arrays.toString(array_int));
        System.out.println("Array sin elementos duplicados: " + Arrays.toString(resultado));
    }
}


