public class ArrayEjercico{
	public static void main(String[] args){

		int[] array_int = {12,3,45,-3,65,-5,88,99,2,23,54,33,27,53,96,0};
		int Numero_mas_alto = array_int[0];
		int Numero_mas_bajo = array_int[0];
		int posicion1 = 0;
		int posicion2 = 0;

		System.out.println("Busca el numero mas alto y el numero mas bajo de este Array");

		for(int i = 0; i < array_int.length; i++){
			if(array_int[i] > Numero_mas_alto){
				Numero_mas_alto = array_int[i];
				posicion1 = i;
			}
		}
		for(int j = 0; j < array_int.length; j++){
			if(array_int[j] < Numero_mas_bajo){
				Numero_mas_bajo = array_int[j];
				posicion2 = j;
			}
		}
		System.out.println("El numero mas alto es: " + Numero_mas_alto + " y esta en la posicion: " + posicion1);
		System.out.println("El numero mas bajo es: " + Numero_mas_bajo + " y esta en la posicion: " + posicion2);
	}
}