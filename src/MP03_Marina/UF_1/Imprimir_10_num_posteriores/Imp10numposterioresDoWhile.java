import java.util.Scanner;

public class Imp10numposterioresDoWhile{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");

		if(lector.hasNextInt()){
			int numero = lector.nextInt();
			int i = numero;
			System.out.println("-------------------");

			do{
				System.out.println(i);
				i++;
			}
			while(i<=numero + 10);
		}
		else{
			System.out.println("ERROR!! Has introducido un valor equivocado.");
		}
	}
}