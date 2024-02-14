public class palabrasbuscar{
	public static void main(String[] args){

		String[] array_palabras1 = {"perro", "gato", "pez", "oso", "koala"};
		String[] array_palabras2 = {"armario", "cajon", "estanteria", "mesilla", "escritorio"};
		boolean encontrada = false;
		String palabra_buscar = "cajon";
		

		System.out.println("Busca la palabra pez en ambos arrays.");

		for(int i = 0; i < array_palabras1.length; i++){
			if(array_palabras1[i].equalsIgnoreCase(palabra_buscar)){
				System.out.println("Has encontrado la palabra en el array_palabras1 y esta en la posicion: " + i);
				encontrada = true;
			}
		}
		for(int j = 0; j < array_palabras2.length; j++){
			if(array_palabras2[j].equalsIgnoreCase(palabra_buscar)){
				System.out.println("Has encontrado la palabra en el array_palabras2 y esta en la posicion: " + j);
				encontrada = true;
			}
		}
		if(!encontrada){
			System.out.println("Esta palabra no esta en ningun array");
		}
	}
}
