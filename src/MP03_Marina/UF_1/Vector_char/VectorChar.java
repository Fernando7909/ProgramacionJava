import java.util.Scanner;

public class VectorChar{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		char[] array_char = new char[12];

		System.out.println("Escribe 12 chars: ");

		for(int i = 0; i < array_char.length; i++){
			array_char[i]= lector.next().charAt(0);

			if(array_char[i] == 'a' || array_char[i] == 'e' || array_char[i] == 'i' || array_char[i] == 'o' || array_char[i] == 'u'){
				array_char[i] = '$';
			}
			else if (array_char[i] >= '0' && array_char[i] <= '9'){
				array_char[i] = '*';
			}
			else{
				array_char[i] = array_char[i];
			}
		}
		for(int j = 0; j < array_char.length; j++){
			System.out.println("El nuevo array es: " + array_char[j]);
		}
	}
}