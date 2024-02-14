import java.util.Scanner;

public class TrianguloInvertido{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int i = 1;
		String asterisco = "*";
		

		if(lector.hasNextInt()){
			int numero = lector.nextInt();
			while(i<=numero){
				int j = 1;
				while(j<=i){
					System.out.print(" ");
					j++;
				}
				j = 1;
				while(j <= numero - i + 1){
					System.out.print(asterisco);
					j++;
				}
				System.out.println();
				i++; 
			}
		}
		else{
			System.out.println("ERROR! Has introducido un valor incorrecto");
		}
	}
}

