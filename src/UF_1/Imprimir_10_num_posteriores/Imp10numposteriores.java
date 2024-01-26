import java.util.Scanner;

public class Imp10numposteriores {
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");

		
		int numero = lector.nextInt();
		System.out.println("------------");

		for(int i = numero; i<=numero + 10; i++){
			System.out.println(i);
		}
	}
}