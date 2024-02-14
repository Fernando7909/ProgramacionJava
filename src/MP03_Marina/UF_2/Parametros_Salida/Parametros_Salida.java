package UF_2.Parametros_Salida;

import java.util.Arrays;

public class Parametros_Salida {
    public static void main(String[] args) {

        int[] array_int = {10789, 2035, 1899, 1459, 2013};

        Arrays.sort(array_int);
        System.out.println("El array_int ordenado es: " + Arrays.toString(array_int));

        System.out.println("El 2º elemento más grande del array_int es: " + array_int[array_int.length - 2]);
    }
}


