package MP03_Marina.UF_4.Proyecto_Persona;

public class Programmer extends Employee{


    //FUNCIONES CONSTRUCTORAS:
    public Programmer(){

    }

    public Programmer(String nombre, String direccion, double salario, String puestoTrabajo) {
        super(nombre, direccion, salario, puestoTrabajo);
    }

    //OTRAS FUNCIONES:
    public void debug(){
        System.out.println(getPuestoTrabajo() + " " + getNombre() + " is debugging code in Python.");
    }

    @Override
    public double calcularBonus(){
        return getSalario() * 0.12;
    }
}
