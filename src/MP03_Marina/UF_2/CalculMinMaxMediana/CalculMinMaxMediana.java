package UF_2.CalculMinMaxMediana;

import java.util.Scanner;
public class CalculMinMaxMediana {
    Scanner lector = new Scanner(System.in);
    int[] array_datos = new int[5];
    public static void main(String[] args){
        CalculMinMaxMediana programa = new CalculMinMaxMediana();
        programa.inicio();
    }
    public void inicio(){
        mostrarMenu();
        array_datos = leerDatos();
        int max = calculaMax(array_datos);
        int min = calcularMin(array_datos);
        double media = calcularMedia(array_datos);
        imprimir(max, min, media);
    }
    public void mostrarMenu(){

        System.out.println("BIENVENIDO!! Introduce 5 valores enteros por teclado: ");
    }
    public int[] leerDatos(){
        if (lector.hasNextInt()){
            for (int i = 0; i < array_datos.length; i++){
                array_datos[i] = lector.nextInt();
            }
        }
        else{
            System.out.println("ERROR! Has introducido un valor equivocado");
        }
        return array_datos;
    }
    public int calculaMax(int[] array_datos){
        int Max = array_datos[0];
        for (int i = 0; i < array_datos.length; i++){
            if(array_datos[i] > Max){
                Max = array_datos[i];
            }
        }
        return Max;
    }
    public int calcularMin(int[] array_datos){
        int Min = array_datos[0];
        for (int j = 0; j < array_datos.length; j++){
            if(array_datos[j] < Min){
                Min = array_datos[j];
            }
        }
        return Min;
    }
    public double calcularMedia(int[] array_datos){
        int suma = 0;
        double media = 0;
        for (int i = 0; i < array_datos.length; i++){
            suma = suma + array_datos[i];
        }
        media = suma / array_datos.length;
        return media;
    }
    public void imprimir(int max, int min, double media){
        System.out.println("La nota maxima del array es: " + max);
        System.out.println("La nota mínima del array es: " + min);
        System.out.println("La nota media del array es: " + media);
    }
}
