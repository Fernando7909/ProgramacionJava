import java.util.Scanner;

public class ejemplo2While{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int[] Array_Enteros = new int[5];
		int i = 0;
		int suma = 0;

		System.out.print("Introduce 5 valores Enteros: ");

		while(i < Array_Enteros.length){
			if(lector.hasNextInt()){
				Array_Enteros[i] = lector.nextInt();

				if(i %2 == 1){
					suma = Array_Enteros[i] + 10;
				}
				else{
					suma = Array_Enteros[i];
				}
				System.out.println("El resultado final es: " + suma);
				i++;
			}
			else{
				System.out.println("ERROR");
			}
		}
	}
}