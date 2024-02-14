import java.util.Scanner;

public class ejemplo4While {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int[] Array_Enteros = new int[8];
        char[] Array_Char = new char[2];
        int i = 0;
        int j = 0;
        int k = 0;

        System.out.println("Escribe 8 numeros enteros y dos char");

        while(i < Array_Enteros.length){
            if(lector.hasNextInt()){
                Array_Enteros[i] = lector.nextInt();
                i++;
            }
            else{
                System.out.println("ERROR! No has introducido un numero entero");
                lector.next();
            }
        }
        System.out.print("Escribe un char: ");
        while(j < Array_Char.length){
            Array_Char[j] = lector.next().charAt(0);

            if (Array_Char[j] == 'a' || Array_Char[j] == 'e' || Array_Char[j] == 'i' || Array_Char[j] == 'o' || Array_Char[j] == 'u'){
                Array_Char[j] = '0';
            }
            j++;    
        }
        while(k < Array_Enteros.length){
            System.out.println(Array_Enteros[k]);
            k++;
        }
        for (int l = 0; l < Array_Char.length; l++) {
            System.out.println(Array_Char[l]);
        }
    }
}