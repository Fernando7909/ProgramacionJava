public class Encontrar_min_max_orden{
	public static void main(String[] args){

		int[] array_int = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};
		int num_max = array_int[0];
		int num_min = array_int[0];

		
		for(int i = 0; i < array_int.length - 1; i++) {
		    for(int j = i + 1; j < array_int.length; j++) {
		     
		        if (array_int[i] > array_int[j]) {
			        int aux = array_int[i];
			        array_int[i] = array_int[j];
			        array_int[j] = aux;
			    }
			}
		}	
		System.out.print("El array ordenado es: [");
    	for (int i = 0; i < array_int.length;i++) {
     		System.out.print(array_int[i] + " ");
    	}
    	System.out.println("]");
 			
		for(int i = 0; i < array_int.length; i++){
			if(array_int[i] > num_max){
				num_max = array_int[i];
			}
			else if (array_int[i] < num_min) {
				num_min = array_int[i];
			}
		}
		System.out.println("El numero mas grande del array es: " + num_max);
		System.out.println("El numero mas pequeño del array es: " + num_min);
	}
}

