import java.util.Scanner;

public class PotenciasDoWhile{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.print("¿Hasta que valor quieres buscar potencis de dos?");

		if(lector.hasNextInt()){
			int numero = lector.nextInt();

			int i = 1;
			do{
				System.out.println(i);
				i=i*2;
			}
			while(i<=numero);
		}
		else{
			System.out.println("ERROR!! Has introducido un valor equivocado.");
		}
	}
}