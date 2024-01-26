import java.util.Scanner;

public class movil{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe tu marca de telefono movil: ");
		String telef = lector.nextLine();


		switch(telef){
			case "samsung":
				System.out.println("Tu telefono movil es: " + telef);
				break;
			case "iphone":
				System.out.println("Tu telefono movil es: " + telef);
				break;
			case "xiaomi":
				System.out.println("tu telefono movil es: " + telef);
				break;
			default:
				System.out.println("Tu telefono no está en la lista");
		}
	}
}