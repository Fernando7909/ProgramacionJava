import java.util.Scanner;

public class ejemplo3For {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int[] Array_Enteros = new int[5];

        System.out.print("Introduce 5 numeros enteros: ");

        for(int i = 0; i < Array_Enteros.length; i++){
            if(lector.hasNextInt()){
                Array_Enteros[i] = lector.nextInt();
                System.out.println("El array inicialmente es: " + Array_Enteros[i]);

                if(Array_Enteros[i] %2 == 0 && i %2 == 0){
                    Array_Enteros[i] = 100;
                }
            }
            else{
                System.out.println("ERROR!");
            }
        }
        System.out.println("Fijate bien en las posiciones que han cambiado de valor");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < Array_Enteros.length; i++){
            System.out.println("El array finalmente es: " + Array_Enteros[i]);
        }
    }
}