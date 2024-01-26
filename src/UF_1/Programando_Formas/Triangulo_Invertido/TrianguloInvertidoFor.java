import java.util.Scanner;

public class TrianguloInvertidoFor{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		String asterisco = "*";

		if(lector.hasNextInt()){
			int numero = lector.nextInt();

			for(int i=1;i<=numero;i++){
				for(int j=1; j<=i; j++){
					System.out.print(" ");
				}
				for(int j=1; j <= numero - i + 1; j++){
					System.out.print(asterisco);
				}
				System.out.println();
			} 
		}
		else{
			System.out.println("ERROR! Has introducido un valor incorrecto");
		}
	}
}