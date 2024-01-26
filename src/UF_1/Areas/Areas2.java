import java.util.Scanner;

public class Areas2 {
	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		System.out.println("¿De que figura quieres calcular el Area?:\n\n Tienes las siguientes opciones: triangulo, cuadrado, rectangulo, trapecio, rombo, paralelogramo o circulo");
		
		String figura = a.nextLine();
		double area = 0;

		if (figura.equals("triangulo")) {

			System.out.println("Introduce la medida de base en centimetros: ");
			float base = a.nextFloat();

			System.out.println("Introduce la medida de altura en centimetros: ");
			float altura = a.nextFloat();

			area = base * altura / 2;
		}

		else if (figura.equals("cuadrado")) {

			System.out.println("Introduce la medida de un lado en centimetros: ");
			float lado1 = a.nextFloat();

			System.out.println("Introduce la medida del segundo lado en centimetros: ");
			float lado2 = a.nextFloat();
			
			area = lado1 * lado2;
		}

		else if (figura.equals("rectangulo")) {

			System.out.println("Introduce la medida de anchura en centimetros: ");
			float anchura = a.nextFloat();

			System.out.println("Introduce la medida de altura en centimetros: ");
			float altura = a.nextFloat();

			area = altura * altura;
		}

		else if (figura.equals("trapecio")) {

			System.out.println("Introduce la medida de base1 en centimetros: ");
			float base1 = a.nextFloat();

			System.out.println("Introduce la medida de base2 en centimetros: ");
			float base2 = a.nextFloat();

			System.out.println("Introduce la medida de la altura en centimetros: ");
			float altura = a.nextFloat();

			area = (base1 + base2) * altura / 2;
		}

		else if (figura.equals("rombo")) {

			System.out.println("Introduce la medida del diagonal mayor en centimetros: ");
			float diagonalmayor = a.nextFloat();

			System.out.println("Introduce la medida del diagonal menor en centimetros: ");
			float diagonalmenor = a.nextFloat();

			area = diagonalmayor * diagonalmenor / 2;
		}

		else if (figura.equals("paralelogramo")) {

			System.out.println("Introduce la medida de base en centimetros: ");
			float base = a.nextFloat();

			System.out.println("Introduce la medida de altura en centimetros: ");
			float altura = a.nextFloat();

			area = base * altura;
		}

		else if (figura.equals("circulo")) {

			System.out.println("Introduce la medida del radio en centimetros: ");
			float radio = a.nextFloat();

			area = Math.PI * Math.pow(radio, 2);
		}


		System.out.println("El Area del " + figura + " es: " + area + " cm2 ");
		
		
	}
}
