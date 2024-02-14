import java.util.Scanner;

public class TrianguloRectanguloWhile{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.print("Escribe el número de líneas que quieres que se impriman: ");

		if(lector.hasNextInt()){
			int numero_lineas = lector.nextInt();
			int i = 1;

			while(i <= numero_lineas){
				int j = numero_lineas - 1;
				while(j>=i){
					System.out.print(" ");
					j--;
				}
				int k = 1;
				while(k<=j){
					System.out.print("@");
					k++;
				}
				System.out.println();
				i++;
			}		
		}
		else{
			System.out.println("ERROR!! Has introducido un valor equivocado.");
		}
	}
}