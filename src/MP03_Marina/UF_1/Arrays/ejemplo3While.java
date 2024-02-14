import java.util.Scanner;

public class ejemplo3While {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int[] Array_Enteros = new int[5];
        int i = 0;

        System.out.print("Introduce 5 numeros enteros: ");

        while(i < Array_Enteros.length){
            if(lector.hasNextInt()){
                Array_Enteros[i] = lector.nextInt();
                System.out.println("El Array inicialmente es: " + Array_Enteros[i]);

                if(Array_Enteros[i] %2 == 0 && i %2 == 0){
                    Array_Enteros[i] = 100;
                }
                i++;
            }
            else{
                System.out.println("ERROR!");
            }
        }
        i = 0;
        System.out.println("Fijate bien el las posiciones que han cambiado de valor");
        System.out.println("-------------------------------------------------------");
        while(i < Array_Enteros.length){
            System.out.println("El Array finalmente es: " + Array_Enteros[i]);
            i++;
        }
        
    }
}