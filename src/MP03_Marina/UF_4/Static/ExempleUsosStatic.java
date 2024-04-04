package MP03_Marina.UF_4.Static;

public class ExempleUsosStatic {

    private static int comptador = 0;
    private int numeroSerie;

    static {
        System.out.println("Iniciador \"static\" que s’executa en carregar la classe");
    }

    {
        System.out.println("Iniciador que s’executa en la creació de cada objecte ");
    }

    public ExempleUsosStatic() {
        comptador++;
        numeroSerie = comptador;
        System.out.println("S’acaba de crear l’objecte número " + numeroSerie);
    }

    public static int nombreObjectesCreats() {
        return comptador;
    }

    public static void main(String args[]) {
        ExempleUsosStatic d1 = new ExempleUsosStatic();
        ExempleUsosStatic d2;
        d2 = new ExempleUsosStatic();
        System.out.println("Número de sèrie de d1 = " + d1.numeroSerie);
        System.out.println("Número de sèrie de d2 = " + d2.numeroSerie);
        System.out.println("Objectes creats: " + nombreObjectesCreats());
    }
}
