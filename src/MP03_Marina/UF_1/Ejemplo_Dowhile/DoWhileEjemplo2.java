import java.util.Scanner;

public class DoWhileEjemplo2{
	public static void main(String[] args){
		
		Scanner lector = new Scanner(System.in);

		System.out.println("Escribe un numero entero: ");
		int numero = lector.nextInt();

		if(numero<=10){
			int i = 0;
			do{
				System.out.println("Vuelve a intentarlo. Escribe un numero entero: ");
				numero = lector.nextInt();
				i++;
			}
			while(numero<=10);
		}
		if(numero > 10){
			System.out.println("Correcto!");
		}
	}
}