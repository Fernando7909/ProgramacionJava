package MP03_Marina.UF_4.Proyecto_Persona;

public class Main {
    public static void main(String[] args){

        //FUNCIONES CONSTRUCTORAS:
        Programmer P = new Programmer("Yaron Gabriel", "C/ Diputacio", 9120.0, "Programmer");
        Manager M = new Manager("Avril Aroldo", "C/ Aribau", 12000.0, "Manager", 30);
        Developer D = new Developer("Iver Dipali", "C/ Estacio", 7200.0, "Developer", "Java");

        System.out.println("Manager´s Bonus: $" + M.getSalario());
        System.out.println("Developer´s Bonus: $" + D.getSalario());
        System.out.println("Programmer´s Bonus: $" + P.getSalario());

        System.out.println("Performance report for " + M.getPuestoTrabajo() + " " + M.getNombre() + ": Excellent");
        System.out.println("Performance report for " + D.getPuestoTrabajo() + " " + D.getNombre() + ": Good");
        System.out.println("Performance report for " + P.getPuestoTrabajo() + " " + P.getNombre() + ": Excellent");

        M.gestionProyecto();
        D.escribirCodigo();
        P.debug();
    }
}
