import java.util.Scanner;

public class WhileCubo{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce in numero para calcular su cubo?");
		int i = 1;


		if(lector.hasNextInt()){
			int numero = lector.nextInt();
			
			while(i <= numero){
				int cubo = i * i * i;
				System.out.println("El cubo de " + i + " es " + cubo);
				++i;
			}
		}
		else{
			System.out.println("ERROR! Has introducido un valor incorrecto.");
		}
	}
}