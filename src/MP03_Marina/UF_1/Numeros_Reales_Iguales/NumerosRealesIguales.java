import java.util.Scanner;

public class NumerosRealesIguales {
	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		double num1, num2;

		System.out.println("Introduce el 1º numero real");
		if(lector.hasNextDouble()){
			num1 = lector.nextDouble();
			System.out.println("Introduce el 2º numero real");
			if(lector.hasNextDouble()){
				num2 = lector.nextDouble();
				if(num1 == num2){
					System.out.println("Los numeros son iguales");
				}
				else{
					System.out.println("Los numeros reales no son iguales.");
				}
			}
			else{
				System.out.println("ERROR! Has introducido un valor incorrecto.");
			}
		}
		else{
			System.out.println("ERROR! Has introducido un valor incorrecto.");
		}
	}
}