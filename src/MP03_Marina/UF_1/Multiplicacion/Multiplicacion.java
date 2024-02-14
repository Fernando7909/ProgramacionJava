import java.util.Scanner;

public class Multiplicacion {
	public static void main(String[] args) {

		Scanner m = new Scanner(System.in);
		
		System.out.println("Introduce el 1º número");
		Double num1 = m.nextDouble();

		System.out.println("Introduce el 2º número");
		Double num2 = m.nextDouble();

		System.out.println("Introduce el 3º número");
		Double num3 = m.nextDouble();
		

    	System.out.println("El resultado de la multiplicación es: " + num1 * num2 * num3);  
	}
}