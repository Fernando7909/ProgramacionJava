package MP03_Marina.Examen;

import java.util.Scanner;
public class Loops_2 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        boolean Medida = false;
        int numero_ingresado = 0;
        int suma = 0;

        System.out.println("Ingresa un número entero positivo: ");

        while (!Medida){
            if (lector.hasNextInt()){
                numero_ingresado = lector.nextInt();
                if (numero_ingresado > 0){
                    Medida = true;
                }
                else {
                    System.out.println("Ingresa un numero positivo.");
                }
            }
            else{
                System.out.println("ERROR! Has introducido un valor equivocado. Vuelve a intentarlo.");
                lector.next();
            }
        }
        for (int i = 0; i < numero_ingresado; i++){
            if (i %2 == 0){
                suma = suma + i;
            }
        }
        System.out.println("La suma de los numero pares hasta " + numero_ingresado + " es: " + suma);
    }
}
