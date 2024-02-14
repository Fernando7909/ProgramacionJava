import java.util.Scanner;

public class ejemplo4For {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int[] array_int = new int[8];
        char[] array_char = new char[3];

        System.out.print("Introduce 8 numeros enteros y tres char: ");

        for(int i = 0; i < array_int.length; i++){
            array_int[i] = lector.nextInt();
        }
        for(int j = 0; j < array_char.length; j++){
            array_char[j] = lector.next().charAt(0);

            if(array_char[j] == 'a' || array_char[j] == 'e' || array_char[j] == 'i' || array_char[j] == 'o' || array_char[j] == 'u'){
                array_char[j] = '0';
            }
        }
        for(int k = 0; k < array_int.length; k++){
            System.out.println(array_int[k]);
        }
        for(int l = 0; l < array_char.length; l++){
            System.out.println(array_char[l]); 
        }
    }
}