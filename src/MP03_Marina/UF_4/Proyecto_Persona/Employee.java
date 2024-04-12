package MP03_Marina.UF_4.Proyecto_Persona;

public abstract class Employee {

    //ATRIBUTOS:
    private String nombre;
    private String direccion;
    private double salario;
    private String puestoTrabajo;


    //FUNCIONES CONSTRUCTORAS:
    public Employee(){}

    public Employee(String nombre, String direccion, double salario, String puestoTrabajo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salario = salario;
        this.puestoTrabajo = puestoTrabajo;
    }

    //GETTERS:
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public double getSalario() {
        return salario;
    }
    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    //SETTERS:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    //OTRAS FUNCIONES:
    public double calcularBonus(){
        return 0.0;
    }

    public String generarReport(){
        return "algo";
    }
}
