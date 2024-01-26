import java.util.Scanner;

public class TrianguloCentrado{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el número de filas: ");
        int numeroDeFilas = scanner.nextInt();
        
       
        for (int i = 0; i < numeroDeFilas; i++) {		    // Iterar a través de cada fila del triángulo
            int numero = 1;									// Empezar con el número 1 para cada fila
            
            
            for (int j = 0; j < numeroDeFilas - i; j++) {	// Imprimir espacios para alinear los números y hacer que se vea como un triángulo
                System.out.print(" ");
            }
            
            
            for (int j = 0; j <= i; j++) {					// Iterar a través de cada número en la fila
                System.out.print(numero + " ");				// Imprimir el número
                numero = numero * (i - j) / (j + 1);
            }     											// Calcular el siguiente número en la fila usando la fórmula de la combinación
                											// nCr = nCr-1 * (n - r + 1) / r
            System.out.println();    						// Ir a la siguiente línea después de imprimir cada fila
        }  
        scanner.close();									// Cerrar el objeto Scanner
    }
}