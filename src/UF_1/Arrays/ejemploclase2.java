import java.util.Scanner;

public class ejemploclase2 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        String[] Array_String = new String[5];
        int[] Array_int = new int[5];

        System.out.println("Escribe 5 nombres y 5 numeros enteros: ");

        for(int i = 0; i < Array_String.length; i++){
            Array_String[i] = lector.nextLine();
        }

        for(int j = 0; j < Array_int.length; j++){
            Array_int[j] = lector.nextInt();
        }

        for(int k = 0; k < Array_String.length; k++){
            System.out.println(Array_String[k] + " " + Array_int[k]);
        }
    }
}
        