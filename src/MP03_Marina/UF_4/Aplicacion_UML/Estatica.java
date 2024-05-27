package MP03_Marina.UF_4.Aplicacion_UML;

public class Estatica extends Web{

    //CONSTRUCTORAS
    public Estatica(){
        super("Wikipedia", "Descripcion", "Windows", "HTML");
    }

    public Estatica(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion) {
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES/METODOS
    public void explicacionTipoApp(){
        System.out.println("La aplicacion ha sido creada? " + aplicacionCreada());
        System.out.println("El numero de Id de la App es: " + getIdApp());
        System.out.println("El numero de IdAppWeb es: " + getIdAppWeb());
        System.out.println("El nombre del tipo de Aplicación seleccionada es: " + getNombre());
        System.out.println("Una aplicacion Web estática es lo que normalmente entendemo como\n"
        + "sitio web, y se caracteriza por lo siguiente: Se suelen desarrollan en HTML y CSS\n"
        + "y puede utilizarse algo de Java Script.");
        System.out.println("El sistema Operativo que utiliza es: " + getSistemaOperativo());
        System.out.println("El lenguaje de programacion utilizado es: " + getLenguajeProgramacion());
    }
}
