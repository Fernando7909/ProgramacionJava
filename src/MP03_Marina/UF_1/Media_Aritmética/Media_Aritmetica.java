public class Media_Aritmetica {
    public static void main(String[] args){

        double[] array_float = {1,9,3,4,5,7.8,7,8,9,10,2.3,5.4};
        double acumulado = 0;
        double resultado = 0;

        for(int i = 0; i < array_float.length; i++){                // En este bucle actualizamos el valor de la variable "acumulado" con cada iteración
           acumulado = acumulado + array_float[i];                  // En su ultima iteracon tendremos la suma de todos los valores del array en la variable "acumulado"
        }
        resultado = acumulado / array_float.length;
        System.out.println("La media Aritmetica es: " + resultado);
    }
}