import java.util.Scanner;

public class Nmg {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        Scanner lector = new Scanner(System.in);
        double num1, num2, num3;
        String txt = "El numero mas grande es ";

        /* Este programa lo he realizado con if anidados. He añadido tambien un medidor de tiempo de ejecucion del programa para saber cual 
        de los 2 programas es mas eficiente, pero es dificil determinarlo ya que el tiempo variará en función de lo que tardes en introducir los numeros.
        Por lo tanto no puedo determinan con seguridad cual de los 2 progrmas es el mas eficiente*/

        System.out.println("Introduce el 1º numero: ");
        if (lector.hasNextDouble()){
            num1 = lector.nextDouble();
            System.out.println("Introduce el 2º numero");
            if(lector.hasNextDouble()){
                num2 = lector.nextDouble();
                System.out.println("Introduce el 3º numero");
                if (lector.hasNextDouble()){
                    num3 = lector.nextDouble();

                    if(num1>=num2 && num1>=num3){
                        System.out.println(txt + num1);
                    }
                    else if (num2>=num1 && num2>=num3){
                        System.out.println(txt + num2);
                    }
                    else if (num3>=num1 && num3>=num2){
                        System.out.println(txt + num3);
                    }
                }
                else{
                    System.out.println("Error. Tienes que ingresar un numero.");
                }
            }
            else{
                System.out.println("Error. Tienes que ingresar un numero.");
            }
        }
        else{
            System.out.println("Error. Tienes que ingresar un numero.");
        }
        long endTime = System.currentTimeMillis();
        long tiempoDeEjecucion = endTime - startTime;
        System.out.println("Tiempo de ejecución: " + tiempoDeEjecucion + " milisegundos");
    }
}