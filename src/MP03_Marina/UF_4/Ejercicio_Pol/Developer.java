package MP03_Marina.UF_4.Ejercicio_Pol;

public class Developer extends Employee{
    String lenguajeProgramacion;

    // Constructor
    public Developer() {}
    public Developer(String nombre, String direccion, double salario, String puestoTrabajo, String lenguajeProgramacion) {
        super(nombre, direccion, salario, puestoTrabajo);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    //Setters
    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
    //Getters
    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }
    
    //Funciones
    public void escribirCodigo(){
        System.out.println("Developer " + nombre + " is writing code");
    }

    @Override
    public double calcularBonus() {
        return salario * 10 / 100;
    }
    @Override
    public String generarReport(){
        String report = "Performance report for Developer " + nombre + ": Good";
        return report;
    }
}
