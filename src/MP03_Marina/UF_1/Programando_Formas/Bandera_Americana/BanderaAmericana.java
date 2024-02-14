public class BanderaAmericana{
	public static void main(String[] args){

		int i = 0;
		int x = 0;
		String estrellas = " * ".repeat(8);			//.repeat sirve para copiar una estructura las veces que quieras
		String lineas_1 = "=".repeat(30);
		String lineas_2 = "=".repeat(54);
		
		while(i <= 8){
			System.out.println(estrellas + lineas_1);
			i = i + 1;
		}
		while(x <= 6){
			System.out.println(lineas_2);
			x = x + 1;
		}
	}
}