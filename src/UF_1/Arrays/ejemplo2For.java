import java.util.Scanner;

public class ejemplo2For{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int[] Array_Enteros = new int[5];
		int suma = 0;

		System.out.print("Introduce 5 valores enteros: ");

		for(int i = 0; i < Array_Enteros.length; i++){
			if(lector.hasNextInt()){
				Array_Enteros[i] = lector.nextInt();

				if(i %2 == 1){
					suma = Array_Enteros[i] + 10;
				}
				else {
					suma = Array_Enteros[i];
				}
				System.out.println("El resultado final es: " + suma);
			}
			else{
				System.out.println("ERROR");
			}
		}
	}
}