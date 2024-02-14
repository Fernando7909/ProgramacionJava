package MP03_Marina.Examen;

import java.util.Scanner;
public class Loops_1 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        boolean Medida = false;
        int numero = 0;

        System.out.println("Ingresa un numero entero positivo: ");

        while (!Medida){
            if(lector.hasNextInt()){
                numero = lector.nextInt();
                if(numero > 0){
                    //numero = numero;
                    Medida = true;
                }
                else {
                    System.out.println("Introduce un numero positivo.");
                    //lector.next();
                }
            }
            else{
                System.out.println("ERROR! Has introducido un valor equivocado. Vuelve a intentarlo");
                lector.next();
            }
        }
        while (numero >= 1){
            System.out.println(numero);
            numero--;
        }
        System.out.println("Contador regresivo completado!");
    }
}
