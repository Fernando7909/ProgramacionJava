import java.util.Scanner;

public class TrianguloRectanguloFor{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.print("Escribe el número de líneas que quieres que se impriman: ");

		if(lector.hasNextInt()){
			int numero_lineas = lector.nextInt();

			for(int i = 1; i <= numero_lineas; i++){

				for(int j = numero_lineas - 1; j >= i; j--){
					System.out.print(" ");
				}

				for(int k = 1; k <= i; k++){
					System.out.print("@");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("ERROR!! Has introducido un valor equivocado.");
		}
	}
}