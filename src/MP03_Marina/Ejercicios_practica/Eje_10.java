package MP03_Marina.Ejercicios_practica;
import java.util.Scanner;
public class Eje_10 {
    Scanner lector = new Scanner(System.in);
    boolean end = false;

    public static void main(String[] args) {
        Eje_10 programa = new Eje_10();
        programa.inicio();
    }

    public void inicio() {

        while (!end) {
            mostrarMenu();
            tratarOpcion();
        }
    }
    public void mostrarMenu(){

        System.out.println("Bienvenidos al programa");
        System.out.println("Vamos a hacer unos calculos");
        System.out.println("Si quieres empezar el programa escribe [start]");
        System.out.println("Si quieres finalizar el programa escribe [end]");
    }
    public void tratarOpcion(){

        String opcion = lector.nextLine();

        if (opcion.equalsIgnoreCase("start")){
            int[] array_int = leerDatos();
            int min = calcularMin(array_int);
            int max = calcularMax(array_int);
            double mediana = calcularMediana(array_int);
            imprimir(min, max, mediana);
        }
        else if (opcion.equalsIgnoreCase("end")) {
            finalizarEjecucion();
        }
        else {
            System.out.println("Opcion incorrecta.");
        }
    }
    public int[] leerDatos(){

        int[] array_int = new int[5];
        boolean medida = false;
        System.out.println("Introduce 5 valores entereos: ");

        while (!medida){
            for (int i = 0; i < array_int.length; i++){
                if (lector.hasNextInt()){
                    array_int[i] = lector.nextInt();
                    medida = true;
                }
                else {
                    System.out.println("ERROR! Introduce un valor entero");
                    i--;
                    lector.next();
                }
            }
            lector.nextLine();
        }
        return array_int;
    }
    public int calcularMin(int[] array_int){

        int min = array_int[0];
        for (int i = 0; i < array_int.length; i++){
            if (min > array_int[i]){
                min = array_int[i];
            }
        }
        return min;
    }
    public int calcularMax(int[] array_int){

        int max = array_int[0];
        for (int i = 0; i < array_int.length; i++){
            if (max < array_int[i]){
                max = array_int[i];
            }
        }
        return max;
    }
    public double calcularMediana(int[] array_int){

        double mediana = 0;
        int suma = 0;
        for (int i = 0; i < array_int.length; i++){
            suma = suma + array_int[i];
        }
        mediana = suma / array_int.length;
        return mediana;
    }
    public void imprimir(int min, int max, double mediana){
        System.out.println("El numero mas alto es: " + max);
        System.out.println("El numero mas bajo es: " + min);
        System.out.println("La media de los numeros es: " + mediana);
    }
    public void finalizarEjecucion(){
        end = true;
    }
}
