package MP03_Marina.Ejercicios_practica;

/*Escribe un programa que cree un ArrayList de caracteres (elige tantos como quieras).
Ahora permita que el usuario ingrese caracteres para adivinar qué caracteres están en la lista de matrices.
Permítale continuar adivinando hasta que haya ingresado todos los caracteres de la lista
(punto extra: imprima al final cuantos intentos hizo).*/

import java.util.Scanner;
public class Eje_8 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        boolean medida1 = false;
        boolean medida2 = false;
        int intentos = 0;
        int contador = 0;
        int longitud = 0;
        char char_introducido = ' ';

        System.out.println("Introduce la medida del vector: ");
        while (!medida1){
            if (lector.hasNextInt()){
                longitud = lector.nextInt();
                if (longitud > 0){
                    medida1 = true;
                }
                else {
                    System.out.println("ERROR! Introduce un numero positivo.");
                }
            }
            else {
                System.out.println("ERROR! Introduce un numero entero positivo.");
                lector.next();
            }
        }
        System.out.println("Introduce los caracteres hasta llenar el vector: ");
        char[] array_char = new char[longitud];
        while (!medida2){
            for (int i = 0; i < array_char.length; i++){
                if (lector.hasNext()){
                    array_char[i] = lector.next().charAt(0);
                    medida2 = true;
                }
                else{
                    System.out.println("ERROR! Has introducido un valor equivocado. Vuelve a intentarlo.");
                    i--;
                    lector.next();
                }
            }
        }
        System.out.println("Introduce caracteres hasta adivinar todos los del array_char");
        while (contador < longitud){
            if (lector.hasNext()) {
                intentos++;
                char_introducido = lector.next().charAt(0);

                for (int i = 0; i < array_char.length; i++) {
                    if (char_introducido == array_char[i]) {
                        array_char[i] = ' ';
                        System.out.println("Has acertado un caracter del array.");
                        contador++;
                    }
                }
                if (contador < longitud){
                    System.out.println("No has acertado el caracter. Sigue intentándolo.");
                }
            }
            else {
                System.out.println("ERROR! Introduce un caracter.");
                lector.next();
            }
        }
        System.out.println("Felicidades, has adivinado todos los caracteres del array_char en " + intentos + " intentos");
    }
}
