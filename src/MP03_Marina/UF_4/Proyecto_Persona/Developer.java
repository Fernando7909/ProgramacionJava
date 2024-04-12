package MP03_Marina.UF_4.Proyecto_Persona;

public class Developer extends Employee{

    //ATRIBUTOS:
    private String lenguajeProgramacion;


    //FUNCIONES CONSTUCTORAS
    public Developer(){}

    public Developer(String nombre, String direccion, double salario, String puestoTrabajo, String lenguajeProgramacion) {
        super(nombre, direccion, salario, puestoTrabajo);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    //GETTERS:
    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    //SETTERS:
    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    //OTRAS FUNCIONES:
    public void escribirCodigo(){
        System.out.println(getPuestoTrabajo() + " " + getNombre() + " is writting code in " + getLenguajeProgramacion());
    }

    @Override
    public double calcularBonus(){
        return getSalario() * 0.10;
    }
}
