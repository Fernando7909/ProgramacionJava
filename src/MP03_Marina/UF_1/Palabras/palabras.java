public class palabras{
	public static void main(String[] args){

		String[] array_palabras1 = {"perro", "gato", "pez", "oso", "koala"};
		String[] array_palabras2 = {"armario", "cajon", "estanteria", "mesilla", "escritorio"};

		System.out.println("Estas son las palabras del array_palabras1 y el array_palabras2: ");
		
		for(int i = 0; i < array_palabras1.length; i++){
			System.out.println(array_palabras1[i]);
			System.out.println(array_palabras2[i]);
		}
		System.out.println("Estas son las palabras del array_palabras1 y el array_palabras2: ");
	}
}