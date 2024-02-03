/*7. Escribe un programa en java para quitar un elemento especifico del array*/

import java.util.Scanner;

public class Ejercicio_7{
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int[] array_int = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] new_array = new int[array_int.length - 1];
        int input_int = 0;
        int contador = 0;
        boolean encontrado = false;

        System.out.println("Introduce un numero del 1 al 9 para eliminarlo del array: ");

        if(lector.hasNextInt()){
        	input_int = lector.nextInt();

            if(input_int < 9){
                for(int i = 0; i < array_int.length; i++) {
                    if (input_int == array_int[i]) {
                        encontrado = true;
                    } 
                    else{                                   //Cada vez que no se cumpla el if, pasa al else donde en cada iteracion, suma el contador
                    	new_array[contador] = array_int[i];   //De esta manera, concretamos el numero de huecos que tendra el array new_int
                    	contador++;
                    }
                }
                System.out.println("Elemento eliminado. El nuevo array es ");
                for(int j = 0; j < contador; j++){
                    System.out.print(new_array[j] + " ");
                } 
            }
            else{
                System.out.println("ERROR! Has introducido un numero fuera de rango");
            }
        } 
        else{
            System.out.println("ERROR! Has introducido un valor equivocado.");
        }
    }
}
