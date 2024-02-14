package UF_2.RegistreNotes;

public class RegistreNotes_mod {

    public static void main(String[] args) {
        RegistreNotes_mod programa = new RegistreNotes_mod();
        programa.inici();
    }

    public void inici() {

        CalculsArrayReals calcular = new CalculsArrayReals();        // Creamos una instancia con el nombre que queramos (Ej. calcular)
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        double max = calcular.calcularMaxim(notes);                 // añadimos la instancia antes de la funcion
        double min = calcular.calcularMinim(notes);
        double mitjana = calcular.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }
}
