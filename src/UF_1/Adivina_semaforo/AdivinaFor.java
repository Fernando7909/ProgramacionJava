package UF_1.Adivina_semaforo;

import java.util.Scanner;
import java.util.Random;

public class AdivinaFor{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		Random random = new Random();
		int numero_secreto = random.nextInt(10) + 1;
		int intentos = 1;
		int numero_introducido = 0;

		System.out.println("Comencemos el juego\nAdivina el valor entero entre 0 y 10 en 3 intentos\nIntroduce un valor entero entre 0 y 10");

		for(intentos = 1; intentos <= 3; intentos++){
			if(lector.hasNextInt()){
				numero_introducido = lector.nextInt();

				if(numero_introducido == numero_secreto){
					System.out.println("Enhorabuena. Lo has acertado");
					break;
				}
				else{
					System.out.println("Has fallado.Vuelve a intentarlo.");
				}
			}
			else{
				System.out.println("ERROR! Has introducido un valor equivocado. Introduce un valor entero entre 0 y 10");
				lector.next();
			}
		}
		if(intentos >= 3){
			System.out.println("Intentos agotados. Has perdido");
		}
	}
}