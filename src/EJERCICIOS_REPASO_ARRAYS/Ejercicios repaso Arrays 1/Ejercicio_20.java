/*20. Escriba un programa Java para convertir una matriz en un ArrayList.*/

import java.util.ArrayList;

public class Ejercicio_20{
	public static void main(String[] args){

		String[] array_string = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

		ArrayList<String> lista = new ArrayList<>();

		for (int i = 0; i < array_string.length; i++) {
			lista.add(array_string[i]);
		}
		System.out.println("El Array convertido a ArrayList es: " + lista);
	}
}