/*Diferencia
Tome dos listas como entrada y devuelva una nueva lista con todos los valores de la primera lista que no están en la segunda lista*/

public class Diferencia {
    public static void main(String[] args) {

        int[] array_int1 = {1, 2, 3, 4};
        int[] array_int2 = {1, 4, 5, 9};
        boolean encontrado = false;

        for (int i = 0; i < array_int1.length; i++) {
            int valor1 = array_int1[i];
            encontrado = false;						//Ponemos false ya que aun no se ha comparado este array con el siguiente

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
    }
}
