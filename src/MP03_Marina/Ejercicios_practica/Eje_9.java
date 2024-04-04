package MP03_Marina.Ejercicios_practica;

import java.util.Scanner;
public class Eje_9 {
    Scanner lector = new Scanner(System.in);

    public static void main(String[] args){
        Eje_9 programa = new Eje_9();
        programa.inicio();
    }
    public void inicio() {
        mostrarMenu();
        int longitud = introLongitud();
        int[] array_int = llenarVector(longitud);
        int Max = calcularMax(array_int);
        int Min = calcularMin(array_int);
        double Mediana = calculMediana(longitud, array_int);
        imprimir(Max, Min, Mediana);
    }
    public void mostrarMenu() {
        System.out.println("Binvenido al programa de calculo de Max, Min y Mediana.");
    }
    public int introLongitud() {
        System.out.println("Introduce la longitud del vector: ");
        boolean medida1 = false;
        int longitud = 0;

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
                System.out.println("ERROR! Introduce un numero entero.");
                lector.next();
            }
        }
        return longitud;
    }
    public int[] llenarVector(int longitud) {
        System.out.println("Introduce números hasta llenar el vector: ");
        boolean medida2 = false;
        int[] array_int = new int[longitud];

        while (!medida2){
            for (int i = 0; i < longitud; i++){
                if (lector.hasNextInt()){
                    array_int[i] = lector.nextInt();
                    medida2 = true;
                }
                else {
                    System.out.println("ERROR! Introduce un numero entero.");
                    i--;
                    lector.next();
                }
            }
        }
        return array_int;
    }
    public int calcularMax(int[] array_int) {
        int Max = array_int[0];
        for (int i = 0; i < array_int.length; i++){
            if (Max < array_int[i]){
                Max = array_int[i];
            }
        }
        return Max;
    }
    public int calcularMin(int[] array_int){
        int Min = array_int[0];
        for (int i = 0; i < array_int.length; i++){
            if (Min > array_int[i]){
                Min = array_int[i];
            }
        }
        return Min;
    }
    public double calculMediana(int longitud, int[] array_int) {
        int suma = 0;
        double Mediana = 0;
        for (int i = 0; i < longitud; i++){
            suma = suma + array_int[i];
        }
        Mediana = suma / longitud;
        return Mediana;
    }
    public void imprimir(int Max, int Min, double Mediana) {
        System.out.println("El numero mas grande del array es: " + Max);
        System.out.println("El nunero mas pequeño del array es: " + Min);
        System.out.println("La media del array es: " + Mediana);
    }
}
