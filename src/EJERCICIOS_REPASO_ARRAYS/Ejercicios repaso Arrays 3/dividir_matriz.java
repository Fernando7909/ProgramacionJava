/*9.Tome una matriz de 10 elementos. Divídalo por la mitad y almacene los elementos en dos matrices diferentes.*/

public class dividir_matriz{
    public static void main(String[] args){

        int[] array_int = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] new_array1 = new int[5];
        int[] new_array2 = new int[5];

        System.out.print("El new_array1 es: [ ");
        for(int i = 0; i < array_int.length / 2; i++) {
            new_array1[i] = array_int[i];
            System.out.print(new_array1[i] + " ");
        }
        System.out.print("]");
        System.out.print("\nEl new_array2 es: [ ");
        for(int j = 0; j < new_array2.length; j++) {
            new_array2[j] = array_int[array_int.length / 2 + j];
            System.out.print(new_array2[j] + " ");
        }
        System.out.print("]");
    }
}
