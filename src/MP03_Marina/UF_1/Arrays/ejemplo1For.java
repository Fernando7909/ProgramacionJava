import java.util.Scanner;

public class ejemplo1For {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int[] Array_enteros = new int[5];

        System.out.print("Introduce 5 valores Enteros: ");

        for(int i = 0; i < Array_enteros.length; i++){
            if(lector.hasNextInt()){
                Array_enteros[i] = lector.nextInt();
            }
            else{
                System.out.print("ERROR");
            }
        }
        for(int i = 0; i < Array_enteros.length; i++){
            System.out.println(Array_enteros[i]);
        }
    }
}