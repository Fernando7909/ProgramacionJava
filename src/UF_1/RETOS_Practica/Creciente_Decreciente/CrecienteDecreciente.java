import java.util.Scanner;

public class CrecienteDecreciente{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		double num1, num2, num3;

		System.out.println("Introduce 3 numeros para saber si estan en orden creciente o decreciente");
		System.out.println("Introduce el 1º numero: ");


		if(lector.hasNextDouble()){
			num1 = lector.nextDouble();
			System.out.println("Introduce el 2º numero: ");
			if(lector.hasNextDouble()){
				num2 = lector.nextDouble();
				System.out.println("Introduce el 3º numero: ");
				if(lector.hasNextDouble()){
					num3 = lector.nextDouble();

					if(num1>num2 && num1>num3){
						System.out.println("Decreceinte");
					}
					else if(num3>num2 && num3>num1){
						System.out.println("Creciente");
					}
					else if(num2>num1 && num2>num3){
						System.out.println("Los numeros no tienen ningun orden.");
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
		else{
			System.out.println("ERROR! Has introducido un valor incorrecto.");
		}
	}
}