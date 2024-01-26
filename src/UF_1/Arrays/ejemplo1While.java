import java.util.Scanner;

public class ejemplo1While {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int[] Array_Enteros = new int[5];               // Creamos el nuevo Array vacío con 5 celdas
        int i = 0;

        System.out.print("Introduce 5 valores enteros para un Vector o Array: ");

        while (i < Array_Enteros.length) {                      // Este bucle se va a ejecutar hasta que se introduzcan 5 valoren enteros validos
            if (lector.hasNextInt()) {
                Array_Enteros[i] = lector.nextInt();           // Los numeros Enteros introducidos por teclado se almacenan en Array_Enteros[i]
                i++;

            } 
            else {
                System.out.println("ERROR! Ingresa un valor entero válido.");
                lector.next();                                 // Limpia el valor no válido del scanner
            }
        }

        System.out.println("Los valores ingresados en el ARRAY son: ");
        for (i = 0; i < Array_Enteros.length; i++) {             // Este bucle recorre cada uno de los numeros almacenados en "Array_Enteros" y lo imprime
            System.out.println(Array_Enteros[i]);
        }
    }
}
