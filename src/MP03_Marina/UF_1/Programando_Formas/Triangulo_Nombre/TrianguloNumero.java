
public class TrianguloNumero{
	public static void main(String[] args){

		int i = 1;

		while(i<=7){
			int j = 1;
			while(j <= i){
				System.out.print(j);		//Utilizamos "print" en vez de "println" para que lo imprima en la misma linea
				j = j + 1;
			}
			System.out.println();
			i=i+1;
		}
	}
}
