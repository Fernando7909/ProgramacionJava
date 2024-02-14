import java.util.Scanner;

public class Imp10numposterioresWhile{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);

		System.out.println("Introduce un número entero: ");

		if(lector.hasNextInt()){
			int numero = lector.nextInt();
			int i = numero;
			System.out.println("-------------------");

			while(i<=numero + 10){
				System.out.println(i);
				i++;
			}
		}
		else{
			System.out.println("ERROR!! Has introducido un valor equivocado.");
		}
	}
}