/*import java.util.Scanner;

public class Eliminar_elemento {
	public static void main(String[] args) {
		Eliminar_elemento programa = new Eliminar_elemento();
		programa.inicio();
	}
	public void inicio() {

		System.out.println("Introduce la medida del array: ");
		Medida_Vector();

		System.out.println("Introduce los numeros para llenar el vector: ");
		Llenar_Vector();
	}
	public boolean Medida_Vector() {
		Scanner lector = new Scanner(System.in);
		boolean Medida = false;

		while (!Medida) {
			if (lector.hasNextInt()) {
				int Longitud = lector.nextInt();
				int[] array_int = new int[Longitud];
			}
			else {
				System.out.println("ERROR! Has introducido un valor equivocado");
			}
			return Medida;
		}
	}
	public int[] Llenar_Vector(int Longitud) {

		Scanner lector = new Scanner(System.in);
		boolean Medida = false;
		int[] array_int = new int[Longitud];

		while (!Medida) {
			if (lector.hasNextInt()) {
				for (int i = 0; i < array_int.length; i++) {
					array_int[i] = lector.nextInt();
				}
			} else {
				System.out.println("ERROR! Has introducido un valor equivocado");
				lector.next();
			}
			return array_int;
		}
	}
}*/


