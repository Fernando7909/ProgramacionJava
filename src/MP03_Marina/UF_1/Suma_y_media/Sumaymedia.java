import java.util.Scanner;

public class Sumaymedia{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		double num1, num2, num3, num4, num5;


		System.out.println("Introduce el 1º numero: ");
		if(lector.hasNextDouble()){
			num1 = lector.nextDouble();
			System.out.println("Introduce el 2º numero: ");
			if(lector.hasNextDouble()){
				num2 = lector.nextDouble();
				System.out.println("Introduce el 3º numero: ");
				if(lector.hasNextDouble()){
					num3 = lector.nextDouble();
					System.out.println("Introduce el 4º numero: ");
					if(lector.hasNextDouble()){
						num4 = lector.nextDouble();
						System.out.println("Introduce el 5º numero: ");
						if(lector.hasNextDouble()){
							num5 = lector.nextDouble();
							double suma = num1 + num2 + num3 + num4 + num5;
							System.out.println("La suma de los 5 numeros es: " + suma);
							double media = suma/5;
							System.out.println("La media de los 5 numeros es: " + media);
						}
						else{
							System.out.println("ERROR! Has introducido un valor incorrecto");
						}
					}
					else{
						System.out.println("ERROR! Has introducido un valor incorrecto");
					}
				}
				else{
					System.out.println("ERROR! Has introducido un valor incorrecto");
				}
			}
			else{
				System.out.println("ERROR! Has introducido un valor incorrecto");
			}
		}
		else{
			System.out.println("ERROR! Has introducido un valor incorrecto");
		}
	}
}