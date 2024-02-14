import java.util.Scanner;

public class PotenciasWhile{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.print("¿Hasta que valor quieres buscar potencias de dos? ");
		int i = 1;

		if(lector.hasNextInt()){
			int numero = lector.nextInt();

			while(i<=numero){
				System.out.println(i);
				i=i*2;
			}
		}
		else{
			System.out.println("ERROR!! Has introducido un valor equivocado.");
		}
	}
}