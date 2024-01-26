import java.util.Scanner;

public class LectorSequencia2ACT {

  public static void main (String[] args) {

    int MAX_VALORS = 80;
    int MARCA_FI = -1;

    float[] arrayNotes = new float[MAX_VALORS];
    int elements = 0;
    Scanner lector = new Scanner(System.in);
    System.out.print("Escriure fins a " + MAX_VALORS + " valors.");
    System.out.println("En pots escriure diversos en una sola línia, separatsper espais.");
    System.out.println("(Per acabar, escriu un" + MARCA_FI + ")");

    while (elements < arrayNotes.length) {
      if (lector.hasNextFloat()) {
      float nota = lector.nextFloat();
        if ((nota >= 0)&&(nota <= 10)) {
          arrayNotes[elements] = nota;
          elements++;
        }
        else if (nota == MARCA_FI) {
          break;
        }
      }
      else {
        lector.next();
      }
    }
    lector.nextLine();
    System.out.println("La seqüència llegida és:");
    for (int i = 0; i < elements;i++) {
      System.out.println(arrayNotes[i]);
    }
  }
}
