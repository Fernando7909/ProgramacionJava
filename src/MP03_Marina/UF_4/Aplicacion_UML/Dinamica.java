package MP03_Marina.UF_4.Aplicacion_UML;

public class Dinamica extends Web{

    //CONSTRUCTORA
    public Dinamica(){
        super("LinkeIn", "Descripción", "MacOS", "Swift");
    }

    public Dinamica(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion) {
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES / METODOS
    public void explicacionTipoApp(){
        System.out.println("La aplicacion ha sido creada? " + aplicacionCreada());
        System.out.println("El numero de Id de la App es: " + getIdApp());
        System.out.println("El nuemro de Id de la Web es: " + getIdAppWeb());
        System.out.println("El nombre del tipo de Aplicación seleccionada es: " + getNombre());
        System.out.println("Las aplicaciones web dinamicas son una herramienta que se vale\n"
        + "de una base de datos para cargar la información y el contenido varía cada vez\n"
        + "que un usuario accede a ellas.");
        System.out.println("El sistema Operativo que utiliza es: " + getSistemaOperativo());
        System.out.println("El lenguaje de programacion utilizado es: " + getLenguajeProgramacion());
    }
}
