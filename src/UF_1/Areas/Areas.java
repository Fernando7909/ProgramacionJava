import java.util.Scanner;

public class Areas {
	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		System.out.println("¿De que figura quieres calcular el Area?:\n\n Tienes las siguientes opciones: triangulo, cuadrado, rectangulo, trapecio, rombo, paralelogramo o circulo");
		
		String figura = a.nextLine();
		double area = 0;

		if (figura.equals("triangulo")) {
			area = 23*8/2;
		}

		else if (figura.equals("cuadrado")) {
			area = 37 * 37;
		}

		else if (figura.equals("rectangulo")) {
			area = 68 * 39;
		}

		else if (figura.equals("trapecio")) {
			area = (35 + 16) * 5 / 2;
		}

		else if (figura.equals("rombo")) {
			area = 75 * 30 / 2;
		}

		else if (figura.equals("paralelogramo")) {
			area = 45 * 13;
		}

		else if (figura.equals("circulo")) {
			area = 3.14 * (2 * 2);
		}
		

		System.out.println("El Area del " + figura + " es: " + area);
		
		
	}
}
