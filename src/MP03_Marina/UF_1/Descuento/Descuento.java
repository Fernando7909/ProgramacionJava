import java.util.Scanner;

public class Descuento {
	public static void main(String[] args) {

		Scanner d = new Scanner(System.in);
		
		System.out.println("¿Cual es el precio del producto en Euros? ");
		float precio = d.nextFloat();

		if (precio >= 100) {
			float descuento = precio * 8 / 100;
			precio = precio - descuento;

		}

    	System.out.println("El precio final por pagar es de: " + precio + "€");  
	}
}