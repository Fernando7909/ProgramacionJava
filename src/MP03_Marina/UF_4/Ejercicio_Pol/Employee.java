package MP03_Marina.UF_4.Ejercicio_Pol;

public class Employee {
    public String nombre;
    public String direccion;
    public double salario;
    public String puestoTrabajo;

    // Constructor
    public Employee() {}
    
    public Employee(String nombre, String direccion, double salario, String puestoTrabajo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salario = salario;
        this.puestoTrabajo = puestoTrabajo;
    }

    //Setters
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

    //Getters
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

    //Funciones
    public double calcularBonus(){
        return salario;
    }
    public String generarReport(){
        String report = "";
        return report;
    }
}
