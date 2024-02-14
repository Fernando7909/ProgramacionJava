import java.util.Scanner;

public class Diadelasemana {
	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		String txt_diasem = "El dia de la semana es: ";
		String txt_error = "ERROR. Has introducido un valor incorrecto.";

		System.out.println("Introduce un número del 1 al 7:");
		if(lector.hasNextDouble()){
			double numero = lector.nextDouble();

			if(numero == 1){
				System.out.println(txt_diasem + "Lunes");
			}
			else if(numero == 2){
				System.out.println(txt_diasem + "Martes");
			}
			else if(numero == 3){
				System.out.println(txt_diasem + "Miercoles");
			}
			else if(numero == 4){
				System.out.println(txt_diasem + "Jueves");
			}
			else if(numero == 5){
				System.out.println(txt_diasem + "Viernes");
			}
			else if(numero == 6){
				System.out.println(txt_diasem + "Sabado");
			}
			else if(numero == 7){
				System.out.println(txt_diasem + "Domingo");
			}
			else{
				System.out.println(txt_error);
				return;
			}
		}
		else{
			System.out.println(txt_error);
		}
	}
}