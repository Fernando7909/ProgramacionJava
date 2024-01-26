/*Valores únicos
Tome dos listas como entrada y devuelva una nueva lista con todos los valores que están solo en una de ambas listas*/

public class Valores_unicos {
    public static void main(String[] args) {

        int[] array_int1 = {1, 2, 3, 4};
        int[] array_int2 = {1, 4, 5, 9};
        boolean encontrado;

        for (int i = 0; i < array_int1.length; i++) {
            int valor1 = array_int1[i];
            encontrado = false;

            for (int j = 0; j < array_int2.length; j++) {
                int valor2 = array_int2[j];

                if (valor1 == valor2) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.print(valor1 + " ");
            }
        }

        for (int i = 0; i < array_int2.length; i++) {
            int valor2 = array_int2[i];
            encontrado = false;

            for (int j = 0; j < array_int1.length; j++) {
                int valor1 = array_int1[j];

                if (valor2 == valor1) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.print(valor2 + " ");
            }
        }
    }
}
