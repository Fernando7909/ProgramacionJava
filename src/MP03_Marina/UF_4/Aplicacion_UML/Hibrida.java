package MP03_Marina.UF_4.Aplicacion_UML;

public class Hibrida extends Movil{

    //CONSTRUCTORAS
    public Hibrida(){
        super("Amazon", "Descripcion", "Android", "Kotlin");
    }

    public Hibrida(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion){
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES
    public void explicacionTipoApp(){
        System.out.println("La aplicacion ha sido creada? " + aplicacionCreada());
        System.out.println("El numero de Id de la App es: " + getIdApp());
        System.out.println("El numero de IdAppMovil es: " + getIdAppMovil());
        System.out.println("El nombre del tipo de Aplicación seleccionada es: " + getNombre());
        System.out.println("Las aplicaciones hibridas son un tipo de aplicaciones movil que combina\n"
        + "características de las aplicaciones nativas y web. Estas se construyen utilizando\n"
        + "tecnologías para el desarrollo web, como en los elementos estructurales de HTML5, CSS3 y JavaScript");
        System.out.println("El sistema Operativo que utiliza es: " + getSistemaOperativo());
        System.out.println("El lenguaje de programacion utilizado es: " + getLenguajeProgramacion());
    }
}
