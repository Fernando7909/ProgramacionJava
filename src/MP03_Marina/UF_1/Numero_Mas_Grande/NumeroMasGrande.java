import java.util.Scanner;

public class NumeroMasGrande {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String txt1 = "El numero mas grande es ";
        double num1, num2, num3;


        //El metodo "hasNextDouble()" sirve para verificar si lo que ingresemos en un valor numerico
        //El "return" sirve para detener el programa cuando ingresamos una entrada NO valida. En este caso un nombre

        System.out.println("Introduce el 1º numero: ");
        if (lector.hasNextDouble()) {
            num1 = lector.nextDouble();
        } else {
            System.out.println("Error. Tienes que ingresar un número válido");
            return;
        }

        System.out.println("Introduce el 2º numero: ");
        if (lector.hasNextDouble()) {
            num2 = lector.nextDouble();
        } else {
            System.out.println("Error. Tienes que ingresar un número válido");
            return;
        }

        System.out.println("Introduce el 3º numero: ");
        if (lector.hasNextDouble()) {
            num3 = lector.nextDouble();
        } else {
            System.out.println("Error. Tienes que ingresar un número válido");
            return;
        }


        if (num1 >= num2 && num1 >= num3) {
            System.out.println(txt1 + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(txt1 + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(txt1 + num3);
        }
    }
}
