package MP03_Marina.UF_4.Ejercicio_Pol;

public class Programmer extends Employee{

    //Constructor
    public Programmer() {}
    public Programmer(String nombre, String direccion, double salario, String puestoTrabajo)
    {
        super(nombre, direccion, salario, puestoTrabajo);
    }

    //Functions
    public static void debug()
    {
        System.out.println("Programmer " + " is debugging code in Python");
    }
    @Override
    public double calcularBonus() {
        return salario * 12 / 100;
    }
    @Override
    public String generarReport(){
        String report = "Performance report for Programmer " + nombre + ": Excellent";
        return report;
    }
}
