package Ejercicios_examen;

/*8.
Escriba un programa para verificar si los elementos de una matriz
son iguales o no y se lee por igual desde adelante o desde atrás.*/

public class repas_6 {
    public static void main(String[] args){

        int[] array_int = {1, 5, 14, 14, 5, 1};
        int[] array_reverse = new int[array_int.length];
        boolean verificado = false;

        System.out.print("El array_reverse es: [ ");
        for(int i = array_int.length - 1; i >= 0; i--) {
            array_reverse[i] = array_int[i];
            System.out.print(array_reverse[i] + " ");
        }
        System.out.print("]");
        for (int j = 0; j < array_int.length; j++){
            if(array_int[j] != array_reverse[j]){
                verificado = false;
                break;
            }
        }
        if(!verificado){
            System.out.println("\nNo se Correcto");
        }
        else{
            System.out.println("Correcto");
        }
    }
}
