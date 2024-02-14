import java.util.Scanner;

public class DiamondWhile {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el número de filas (la mitad del diamante): ");

        if (lector.hasNextInt()) {
            int numero = lector.nextInt();
            int i = 1;

            // Mitad superior del diamante
            while (i <= numero) {
                int j = 1, k = 1;
                while (j <= numero - i) {
                    System.out.print(" ");
                    j++;
                }
                while (k <= 2 * i - 1) {
                    System.out.print("*");
                    k++;
                }
                i++;
                System.out.println();
            }

            // Mitad inferior del diamante
            i = numero - 1;
            while (i >= 1) {
                int j = 1, k = 1;
                while (j <= numero - i) {
                    System.out.print(" ");
                    j++;
                }
                while (k <= 2 * i - 1) {
                    System.out.print("*");
                    k++;
                }
                i--;
                System.out.println();
            }
        } 
        else {
            System.out.println("ERROR!! Has introducido un valor equivocado.");
        }
    }
}
