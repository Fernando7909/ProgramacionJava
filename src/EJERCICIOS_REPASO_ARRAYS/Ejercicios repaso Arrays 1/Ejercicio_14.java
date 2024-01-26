/*14. Escriba un programa Java para encontrar elementos comunes entre dos matrices (valores de cadena).*/

public class Ejercicio_14{
	public static void main(String[] args){

		String[] array_string1 = {"html", "python", "go", "java"};
		String[] arrar_string2 = {"kotlin", "sql", "java", "go", "c++", "c#"};

		for(int i = 0; i < array_string1.length; i++){
			for(int j = 0; j < arrar_string2.length; j++){

				if(array_string1[i].equalsIgnoreCase(arrar_string2[j])){
					System.out.println("El elemento comun entre los 2 arrays es: " + array_string1[i]);
				}
			}
		}
	}
}