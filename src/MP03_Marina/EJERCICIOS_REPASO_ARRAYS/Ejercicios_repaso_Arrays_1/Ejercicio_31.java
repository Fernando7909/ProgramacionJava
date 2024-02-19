/*31. Escriba un programa Java para verificar si la suma de todos los numeros 10 en la matriz 
es exactamente 30. Devuelva falso si la condición no se cumple; en caso contrario, verdadero*/

public class Ejercicio_31{
	public static void main(String[] args){

		int[] array_int = {10,20,30,50,10,90,20,10};
		int suma = 0;
		int resultado_suma = 30;

		for(int i = 0; i < array_int.length; i++){
			if(array_int[i] == 10){
				suma = suma + array_int[i];
			}
		}
		if(resultado_suma == suma){
			System.out.println("Verdadero");
		}
		else{
			System.out.println("Falso");
		}
	}
}