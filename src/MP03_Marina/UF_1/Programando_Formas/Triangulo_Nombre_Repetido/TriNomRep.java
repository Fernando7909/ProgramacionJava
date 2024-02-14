public class TriNomRep {
	public static void main (String[] args){

		int i = 1;

		while(i<=8){
			int j = 1;
			while(j<=i){
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}