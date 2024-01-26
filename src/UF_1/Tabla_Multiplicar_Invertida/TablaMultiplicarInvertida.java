import java.util.Scanner;

public class TablaMultiplicarInvertida{
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		System.out.println("¿Que tabla de multiplicar quieres calcular?");
		int contador = 10;

		if(lector.hasNextInt()){
			int tabla = lector.nextInt();

			while(contador>=0){
				System.out.println(tabla + " x " + contador + " = " + tabla*contador);
				-- contador;
			}
			System.out.println("Esta es la tabla del " + tabla + ".");
		}
		else{
			System.out.println("Has introducido un valor incorrecto.");
		}
	}
}