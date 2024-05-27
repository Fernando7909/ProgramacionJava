package MP03_Marina.UF_4.Aplicacion_UML;

public class Nativa extends Movil{

    //CONSTRUCTORAS
    public Nativa(){
        super("Netfix", "Descripcion", "iOS", "Swift");
    }
    public Nativa(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion){
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES
    public void explicacionTipoApp(){
        System.out.println("La aplicacion ha sido creada? " + aplicacionCreada());
        System.out.println("El numero de Id de la App es: " + getIdApp());
        System.out.println("El numero de IdAppMovil es: " + getIdAppMovil());
        System.out.println("El nombre del tipo de Aplicación seleccionada es: " + getNombre());
        System.out.println("Se llaman aplicaciones nativas debido a que se desarrollan para el\n"
        + "sistema operativo nativo de cada dispositivo. Este tipo de aplicaciones moviles son\n"
        + "aquillas que nos descargamos en las tiendas de apps como pueden ser Play Store\n"
        + "(Android) y App Store (iOS)");
        System.out.println("El sistema Operativo que utiliza es: " + getSistemaOperativo());
        System.out.println("El lenguaje de programacion utilizado es: " + getLenguajeProgramacion());
    }
}
