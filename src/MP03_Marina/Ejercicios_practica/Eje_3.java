package MP03_Marina.Ejercicios_practica;

import java.util.Scanner;
public class Eje_3 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        char[] array_char = new char[12];
        boolean Medida = false;

        System.out.println("Introduce 12 chars: ");

        while (!Medida){
            for (int i = 0; i < array_char.length; i++){
                if (lector.hasNext()){
                    array_char[i] = lector.next().charAt(0);
                    Medida = true;
                }
                else{
                    System.out.println("ERROR! Introduce un char.");
                    i--;
                    lector.next();
                }
            }
        }
        for (int i = 0; i < array_char.length; i++){
            if (array_char[i] == 'a' || array_char[i] == 'e' || array_char[i] == 'i' || array_char[i] == 'o' || array_char[i] == 'u'){
                System.out.println("$");
            }
            else if (array_char[i] >= '0' && array_char[i] <= '9') {
                System.out.println("*");
            }
            else{
                System.out.println(array_char[i]);
            }
        }
    }
}
