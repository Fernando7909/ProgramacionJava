import java.util.Scanner;

public class DesConErrores {
	public static void main(String[] args){

		Scanner d = new Scanner(System.in);

		System.out.println("Introduce el precio inicial en Euros: ");
		double precio = d.nextDouble();

		double descuento_minimo = 8;
		double compra_minima_para_descuento = 100;
		double descuento_maximo = 10;


		if(precio > 0){

			if (precio >= compra_minima_para_descuento){
				double calculo_descuento = precio * descuento_minimo / 100;
				
		
				if(calculo_descuento > descuento_maximo){
					calculo_descuento = descuento_maximo;
				}

				precio = precio - calculo_descuento;

				System.out.println("El precio final es: " + precio + " Euros");
			}

			else{
				System.out.println("El precio final es de: " + precio + " Euros");
			}
		}

		else{
			System.out.println("El precio inicial que has introducido es negativo");
		}
	}
}
