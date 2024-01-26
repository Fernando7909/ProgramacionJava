import java.util.Scanner;

public class Potencias{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.println("¿Hasta que valor quieres buscar potencias de dos? ");
		int numero = lector.nextInt();

		for(int i=1; i<=numero; i=i*2){
			System.out.println(i);
		}
	}
}