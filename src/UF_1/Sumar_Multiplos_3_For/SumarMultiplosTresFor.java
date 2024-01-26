import java.util.Scanner;

public class SumarMultiplosTresFor {
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.println("¿Hasta que valor quieres sumar multiplos de 3?");
		int numero = 0;
		int suma = 0;


		if(lector.hasNextInt()){
			numero = lector.nextInt();
			for(int i=0; i<=numero; i = i + 3){
				if(i %3 == 0){
					System.out.println("Añadimos " + i + "...");
					suma = suma + i;
				}
			}
			System.out.println("El resultado final es " + suma);
		}	
		else{
			System.out.println("ERROR! Has introducido un valor incorrecto.");
		}
	}
}