import java.util.Scanner;

public class TablaMultiplicar{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		int contador = 0;

		System.out.println("¿Que tabla de multiplicar quieres calcular?");
		int tabla = lector.nextInt();

		while(contador<=10){
			System.out.println(tabla + " x " + contador + " = " + tabla*contador);
			++ contador;
		}
		System.out.println("Esta es la tabla del " + tabla + ".");
	}
}
