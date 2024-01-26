//Un programa per ordenar valors usant l’algorisme de la bombolla.  --> bubblesort
public class BubbleSort {
   public static void main (String[] args) {

      float[] llistaNotes = {5.5f, 9f, 2f, 10f, 4.9f};

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
      }
      System.out.println("]");
   }
}