//Un programa per ordenar valors usant l’algorisme de la bombolla.  --> bubblesort
public class Media_suspensos_ordenados {
   public static void main (String[] args) {

      float[] llistaNotes = {5.5f, 9f, 2f, 10f, 4.9f};
      float sumar_arrays = 0;
      float contador = 0;
      float resultado = 0;


      for (int i = 0; i < llistaNotes.length - 1; i++) {
         for(int j = i + 1; j < llistaNotes.length; j++) {

            if (llistaNotes[i] > llistaNotes[j]) {
               System.out.print("He entrat a l'IF \n");
               System.out.print("Comparo la posicion i " + llistaNotes[i] + " con posicion j " + llistaNotes[j] + "\n");

               float aux = llistaNotes[i];
               llistaNotes[i] = llistaNotes[j];
               llistaNotes[j] = aux;
            }
         }
      }
      System.out.print("L’array ordenado és: [");
      for (int i = 0; i < llistaNotes.length;i++) {
         System.out.print(llistaNotes[i] + " ");
         if(llistaNotes[i] < 5){                         //Esta condicion le suma a la variable contador el numero de iteracoines correspondientes
            contador++;                                  //a la cantidad de suspenson que hay en el array. En este caso hay 2 suspensos, por lo tanto
         }                                               // la variable contador valdra 2 en su ultima iteracion.
      }
      System.out.println("]");

      System.out.println("Vamos a calcular la media aritmetica de esta lista de arrays: ");

      for(int k = 0; k < contador; k++){                        //Gracias a la variable contador, este bucle solo hace las iteraciones correspondientes
            sumar_arrays = sumar_arrays + llistaNotes[k];       //al numero de suspensos. Por lo tanto, hara 2 iteraciones
            resultado = sumar_arrays / contador;
      }
      System.out.println("La media aritmetica de las notas con suspenso es: " + resultado);
   }
}