import java.util.Scanner;

public class ejemploclase {
    public static void main(String[] args){

        double[] Array_double = new double[10];                          
        System.out.println("Escribe 10 numeros enteros");

        Scanner lector = new Scanner(System.in);

        for(int i= 0; i<Array_double.length;i++){
            Array_double[i] = lector.nextDouble();
            System.out.println("La posicion i " + i + " vale " + Array_double[i]);

            if(Array_double[i] %2 == 0 && i%2 == 0){
                System.out.println("Es par");
            }
        }
    }
}