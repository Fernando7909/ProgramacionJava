public class BanderaAmericanaDoWhile{
	public static void main(String[] args){
		
		int i=0;
		int j=0;

		do{
			System.out.println(" * ".repeat(8) + "=".repeat(30));
			i++;
		}
		while(i<=8);

		do{
			System.out.println("=".repeat(54));
			j++;
		}
		while(j<=6);
	}
}