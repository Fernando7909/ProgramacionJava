public class EstructurasRepeticionEjemplo{
	public static void main(String[] args){

		int contador = 0;			// Siempre se empieza a contar desde 0

		System.out.println("El contador vale 0");

		while(contador<10){
			System.out.println("Contador +1");
			++ contador;
		}
		System.out.println("El contador ha llegado a 10");
	}
}