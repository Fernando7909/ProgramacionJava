import java.util.Scanner;

public class LectorSequenciaACT {
  public static void main (String[] args) {

    Scanner lector = new Scanner(System.in);
    int nombreValors = 0;

    while (nombreValors <= 0) {
      System.out.print("Quantes notes vols introduir? ");
      if (lector.hasNextInt()) {
        nombreValors = lector.nextInt();
      }
      else {
        lector.next();
      }
    }
    lector.nextLine();
    System.out.println("Es llegiran " + nombreValors + " valors reals.");
    System.out.println("En pots escriure diversos en una sola línia, separats per espais.");
    float[] arrayNotes = new float[nombreValors];
    int index = 0;
    while (index < arrayNotes.length) {
      if (lector.hasNextFloat()) {
        float nota = lector.nextFloat();
        if ((nota >= 0)&&(nota <= 10)) {
          arrayNotes[index] = nota;
          index++;
        }
      }
      else {
        lector.next();
      }
    }
    lector.nextLine();
    System.out.println("La seqüència llegida és:");
    for (int i = 0; i < arrayNotes.length;i++) {
      System.out.println(arrayNotes[i]);
    }
  }
}
