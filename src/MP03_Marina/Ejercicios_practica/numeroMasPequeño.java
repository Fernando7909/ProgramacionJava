package MP03_Marina.Ejercicios_practica;

import java.util.Scanner;
public class numeroMasPequeño {
    Scanner lector = new Scanner(System.in);
    boolean fin = false;
    public static void main(String[] args){
        numeroMasPequeño programa = new numeroMasPequeño();
        programa.inicio();
    }
    public void inicio(){
        while (!fin){
            mostrarMenu();
            tratarOpcion();
        }
    }
    public void mostrarMenu(){
        System.out.println("Bienvenido al programa de calculo");
        System.out.println("Si quieres comenzar escribe [start]");
        System.out.println("Si quieres salir escribe [end]");
    }
    public void tratarOpcion(){
        String opcion = lector.nextLine();

        if (opcion.toLowerCase().equalsIgnoreCase("start")) {
            int[] array_int = llenarVector();
            calcularMin(array_int);
        } else if (opcion.toLowerCase().equalsIgnoreCase("end")) {
            finalizarEjecucion();
        } else {
            System.out.println("ERROR! Escribe la opcion correcta.");
        }
    }
    public int[] llenarVector(){
        int[] array_int = new int[3];
        boolean medida = false;

        System.out.println("Introduce 3 numeros enteros: ");
        while (!medida){
            for (int i = 0; i < array_int.length; i++){
                if (lector.hasNextInt()){
                    array_int[i] = lector.nextInt();
                    System.out.println("El numero " + (i + 1) + " es : " + array_int[i]);
                    medida = true;

                }
                else {
                    System.out.println("ERROR! Ingresa un numero entero.");
                    i--;
                    lector.next();
                }
            }
        }
        return array_int;
    }
    public void calcularMin(int[] array_int){
        int min = array_int[0];
        for (int i = 0; i < array_int.length; i++){
            if (min > array_int[i]){
                min = array_int[i];
            }
        }
        System.out.println("El valor mas pequeño es: " + min);
    }
    public void finalizarEjecucion(){
        fin = true;
    }
}
