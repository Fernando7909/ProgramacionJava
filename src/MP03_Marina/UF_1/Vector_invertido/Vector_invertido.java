import java.util.Scanner;

public class Vector_invertido{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int[] array_int = new int[5];


		System.out.println("Introduce 5 numeros enteros: ");

		for(int i = 0; i < array_int.length; i++){
			if(lector.hasNextInt()){
				array_int[i] = lector.nextInt();
			}
			else{
				System.out.println("ERROR!");
			}
		}
		System.out.print("El array invertido es [ ");
		for(int k = array_int.length - 1; k >= 0; k--){
			System.out.print(array_int[k] + " ");
		}
		System.out.print("]");
	}
}