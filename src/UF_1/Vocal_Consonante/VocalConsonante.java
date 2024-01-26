import java.util.Scanner;

public class VocalConsonante{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce una letra: ");
		String entrada = lector.nextLine();


		if(entrada.length() == 1){																	// Verificamos que se esta introduciendo 1 sola letra
			char letra = Character.toLowerCase(entrada.charAt(0));									// Tomamos el primer carácter(0) del "String entrada" utilizando "entrada.charAt(0)", lo convierte a minúsculas con "Character.toLowerCase()", y lo almacena en la variable letra.
			if(Character.isLetter(letra)){															// Verificamos que el caracter introducido es una letra
				if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
					System.out.println("Es una vocal.");
				}
				else{
					System.out.println("Es una consonante");
				}
			}
			else{
				System.out.println("ERROR. " + letra + " no es una letra.");
			}
		}
		else{
			System.out.println("ERROR. Has introducido un valor incorrecto.");
		}
	}
}



