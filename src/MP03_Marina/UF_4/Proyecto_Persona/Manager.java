package MP03_Marina.UF_4.Proyecto_Persona;

public class Manager extends Employee{

    //ATRIBUTOS:
    private int numTrabajadores;


    //FUNCIONES CONSTRUCTORAS:
    public Manager(){}

    public Manager(String nombre, String direccion, double salario, String puestoTrabajo, int numTrabajadores) {
        super(nombre, direccion, salario, puestoTrabajo);
        this.numTrabajadores = numTrabajadores;
    }

    //GETTERS:
    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    //SETTERS:
    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }

    //OTRAS FUNCIONES:
    public void gestionProyecto(){
        System.out.println(getPuestoTrabajo() + " " + getNombre() + " is managing a project.");
    }
    @Override
    public String generarReport(){
        System.out.println("Performance report for " + getPuestoTrabajo() + " " + getNombre() + ": Excellent");
        return null;
    }

    @Override
    public double calcularBonus(){
        return getSalario() * 0.15;
    }
}
