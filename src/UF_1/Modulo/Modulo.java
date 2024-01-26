import java.util.Scanner;

public class Modulo {
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		String error = "ERROR! Has introducido un valor incorrecto.";


		System.out.println("¿Cual es el dividendo?");
		if(lector.hasNextInt()){
			int dividendo = lector.nextInt();
			System.out.println("¿Cual es el divisor?");
			if(lector.hasNextInt()){
				int divisor = lector.nextInt();

				while(dividendo > divisor){
					dividendo = dividendo - divisor;
					System.out.println("Bucle: por ahora el dividendo vale: " + dividendo);
				}
				System.out.println("El resultado final es: " + dividendo);
			}
			else{
				System.out.println(error);
			}
		}
		else{
			System.out.println(error);
		}
	}
}

		

