package UF_1.Adivina_semaforo;

import java.util.Scanner;
import java.util.Random;

public class AdivSema {
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		Random random = new Random();

		String txt = "Introduce un valor entero entre 0 y 10";
		int numero_aleatorio = random.nextInt(10) + 1;
		int intento = 1;
		int numero = 0;


		System.out.println("Comencemos el juego\nAdivina el valor entero entre 0 y 10 en 3 intentos");

		while(intento <= 3){
			System.out.println(txt);
			
			if(lector.hasNextInt()){
				numero = lector.nextInt();
				
				if(numero == numero_aleatorio){
					System.out.println("ENHORABUENA!! Lo has acertado");
					break;															// Se utiliza para salir del bucle, cuando has acertado el numero secreto.
				}
				else{
					System.out.println("Has fallado! Vuelve a intentarlo");
					intento = intento + 1;
				}
			}
			else{
				System.out.println("ERROR!! Has introducido un valor equivocado");
				lector.next();														/* Descartar valores que no sean "int" introducidos al comienzo del bucle. Te permite volver a ingresar un valor */
			}																		
		}
		if(intento > 3){
			System.out.println("Intentos agotados. Has perdido!");
		}
	}
}