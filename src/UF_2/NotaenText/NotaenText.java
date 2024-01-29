import java.util.Scanner;

public class NotaenText {
  private String text = "";
  private double[] arraynotes = new double[5];

  public static void main (String args[]){
    NotaenText programa = new NotaenText();
    programa.inici();
    }

   public void inici() {
    menu();
    for (int i = 0; i < arraynotes.length; i++) {
      TextGlobal(i);
      System.out.println("La nota [ "+arraynotes[i]+" ] es queda en un [ "+text+" ]");
    }
   }

    public void menu() {
    Scanner s = new Scanner(System.in);
    System.out.println("Ara sabrem les teves notes globals");
    System.out.println("--------------------------------");
      for (int i = 0; i < arraynotes.length; i++) {
          System.out.println("Escriu una nota:");
          arraynotes[i] = s.nextDouble();
      }
    }

    public void TextGlobal(int i) {
          if (arraynotes[i] >= 9 && arraynotes[i] <= 10) {
            NotaAParaula("Excelent");
          }
          else if (arraynotes[i] >= 6.5 && arraynotes[i] <= 8.9) {
            NotaAParaula("Notable");
          }
          else if (arraynotes[i] >= 5 && arraynotes[i] <= 6.4) {
            NotaAParaula("Aprovat");
          }
          else if (arraynotes[i] >= 0 && arraynotes[i] <= 4.9) {
            NotaAParaula("Suspés");
          }
          else {
            NotaAParaula("Nota no vàlida");
          }
    }

    public void NotaAParaula(String nota){
    	text = nota;
    }

 
}





