import java.util.Scanner;

public class Diadelmesswitch {
	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Que número de mes quieres analizar [1-12]");
		int mes = lector.nextInt();

		switch(mes){
			case 2:
				System.out.println("28 o 29");
				break;

			case 4: case 6: case 9: case 11:
				System.out.println("30");
				break;

			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("31");
				break;

			default:
				System.out.println("Este numero de mes no existe");
		}
	}
}
		

		