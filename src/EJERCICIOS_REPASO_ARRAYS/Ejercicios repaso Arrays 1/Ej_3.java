/*3. Escriba un programa Java para imprimir la siguiente cuadrícula.

Rendimiento esperado :

- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - - */

public class Ej_3{
	public static void main(String[] args){

		for(int i = 0; i < 10; i++){
			System.out.println();

			for(int j = 0; j < 10; j++){
				System.out.print(" - ");
			}
		}
	}
}