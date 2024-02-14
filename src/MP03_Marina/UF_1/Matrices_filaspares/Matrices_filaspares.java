package UF1.EJERCICIOS_CLASE.Matrices_filaspares;

public class Matrices_filaspares {
  public static void main(String[] args) {
    System.out.println("---------------------");
    System.out.println("VECTOR");
    System.out.println("---------------------");

    int[] arrayParells = new int[10];
    for(int i = 0; i < arrayParells.length; i++) { //recorrem el vector
      arrayParells[i] = i*10;
      if(i %2 == 0){
        arrayParells[i] = 0;
      }
      System.out.println("La posició " + i + " del vector arrayParells val: " + arrayParells[i]);
    }

    System.out.println();
    System.out.print("[ ");
    for(int i = 0; i < arrayParells.length; i++) {
      System.out.print(arrayParells[i] + " ");
    }
    System.out.println(" ]");


    System.out.println("---------------------");
    System.out.println("MATRIU");
    System.out.println("---------------------");    //------------------
    int [][] matriuParells = new int[10][10];

    for(int i = 0; i < matriuParells.length; i++) {
        for(int j = 0; j < matriuParells[i].length; j++) {
          matriuParells[i][j] = i;
          if(i %2 == 0){
            matriuParells[i][j] = 0;
          }
          System.out.println("La posició " + i + " " + j + " de la matriu matriuParells val: " + matriuParells[i][j]);
        }
        System.out.println("La fila " + i + " de la matriu matriuParells ja està tota plena");
        System.out.println();

    }

    System.out.println();
    for(int i = 0; i < matriuParells.length; i++) {
        for(int j = 0; j < matriuParells[i].length; j++) {
          System.out.print(matriuParells[i][j]+ " ");
        }
        System.out.println("   --> Fila " + i);
    }
  }
}
