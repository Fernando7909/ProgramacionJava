//Importamos la clase "Scanner" de la biblioteca "java.util"

import java.util.Scanner;

//Escribimos el enunciado para los programas java y definimos la clase

public class PrediccionPersona {
	public static void main(String[] args) {

		// Ponemos un nombre a Scanner para poder introducir info desde la terminal

		Scanner a = new Scanner(System.in);


		System.out.println("Escribe el mes en el que has nacido: \n Enero\t Febrero\t Marzo\n Abril\t Mayo\t Junio\n Julio\t Agosto\t Septiembre\n Octubre\t Noviembre\t Diciembre");
		String mes = a.nextLine();

		System.out.println("¿Como te llamas?");
		String nombre = a.nextLine();

		System.out.println("Para acabar, ¿cuantos años tienes?");
		int edad = a.nextInt();

		System.out.println(" Encantado de conocerte " + nombre + " Con los datos que me has proporcionado, mira lo que he llegado a saber de tí\n");
		
		// Declaramos las variables que vamos a utilizar en los condicionales, asi, dentro de los condicionales
		// no es necesario que volvamos a declarar el tipo de dato 

		int numero_de_la_suerte = 0;
		String equipo = "";
		String lenguaje_programacion = "";
		String txt1 = "";
		String txt2 = "";



		if (mes.equalsIgnoreCase("Enero")) {
			numero_de_la_suerte = edad * 3 / 2;
			equipo = "Bayern";
			lenguaje_programacion = "C++";
		}

		else if (mes.equalsIgnoreCase("Febrero")) {
			numero_de_la_suerte = edad - 4;
			equipo = "Atletico de Madrid";
			lenguaje_programacion = "Python";
		}

		else if (mes.equalsIgnoreCase("Marzo")) {
			numero_de_la_suerte = edad / 2;
			equipo = "Chelsea";
			lenguaje_programacion = "JavaScript";
		}

		else if (mes.equalsIgnoreCase("Abril")) {
			numero_de_la_suerte = edad % 4;
			equipo = "Manchester City";
			lenguaje_programacion = "Node.js";
		}

		else if (mes.equalsIgnoreCase("Mayo")) {
			numero_de_la_suerte = edad * 3/6;
			equipo = "Liverpool";
			lenguaje_programacion = "React";
		}

		else if (mes.equalsIgnoreCase("Junio")) {
			numero_de_la_suerte = edad + edad;
			equipo = "Real Madrid";
			lenguaje_programacion = "C#";
		}

		else if (mes.equalsIgnoreCase("Julio")) {
			numero_de_la_suerte = edad * edad / 5;
			equipo = "BVB";
			lenguaje_programacion = "Swift";
		}

		else if (mes.equalsIgnoreCase("Agosto")) {
			numero_de_la_suerte = edad * 1/2 * edad;
			equipo = "Barça";
			lenguaje_programacion = "Java";
		}

		else if (mes.equalsIgnoreCase("Septiembre")) {
			numero_de_la_suerte = edad / edad;
			equipo = "Juventus";
			lenguaje_programacion = "PHP";
		}

		else if (mes.equalsIgnoreCase("Octubre")) {
			numero_de_la_suerte = edad * 4 / 3;
			equipo = "ParisSG";
			lenguaje_programacion = "R";
		}

		else if (mes.equalsIgnoreCase("Noviembre")) {
			numero_de_la_suerte = edad %2 + 23;
			equipo = "Sevilla";
			lenguaje_programacion = ("GO");
		}

		else if (mes.equalsIgnoreCase("Diciembre")) {
			numero_de_la_suerte = (edad + edad) / 2;
			equipo = "Manchester United";
			lenguaje_programacion = "Ruby";
		}

		else {
			txt1 = ("Tu equipo de futbol preferido, aunque no lo digas en voz alta,\n es porque no tengo equipo favorito por que me he equivocado escribiendo mi mes de cumpleaños\n");
			txt2 = ("Tu lenguaje de programacion favorito es que no tengo lenguaje de programacion favorito por que me he equivocado escribiendo mi mes de cumpleaños\n ");

			System.out.println("No entiendo lo que me has dicho!!!!!!!!!!!!!! \n");
			System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ __ _ \n");


		}

		System.out.println(" Tu numero de la suerte es " + numero_de_la_suerte + "\n");
		System.out.println(" Tu equipo favorito es " + equipo + txt1 + "\n");
		System.out.println(" Tu lenguaje de programacion favorito es " + lenguaje_programacion + txt2 + "\n");

		System.out.println("Vuelve cuando quieras");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ __ _ _");
	}
}

		