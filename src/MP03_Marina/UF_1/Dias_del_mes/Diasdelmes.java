import java.util.Scanner;

public class Diasdelmes {
	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		int mes, año;
		String txt_error = "ERROR. Has introducido un valor incorrecto.";


		System.out.println("Introduce un numero de mes: ");
		if(lector.hasNextInt()){
			mes = lector.nextInt();
			System.out.println("Introduce un año: ");
			if(lector.hasNextInt()){
				año = lector.nextInt();

				if(mes >=1 && mes <=12){
					if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
					System.out.println("31 días");
					} 
					else if(mes==4 || mes==6 || mes==9 || mes==11){
						System.out.println("30 días");
					}
					else if(mes==2){
						if((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))){
							System.out.println("El mes de Febrero de " + año + " tiene 29 dias.");
						}
						else{
							System.out.println("El mes de Febrero de " + año + " tiene 28 dias");
						}
					}
				}
				else{
					System.out.println(txt_error);
				}
			}
			else{
				System.out.println(txt_error);
			}
		}
		else{
			System.out.println(txt_error);
		}

	}			
}


