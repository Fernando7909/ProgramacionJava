package MP03_Marina.UF_4.Aplicacion_UML;

public class WebApp extends Movil{

    //CONSTRUCTORAS
    public WebApp() {
        super("YouTube", "Descripción", "Windows", "HTML");
    }

    public WebApp(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion) {
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES
    public void explicacionTipoApp(){
        System.out.println("La aplicacion ha sido creada? " + aplicacionCreada());
        System.out.println("El numero de Id de la App es: " + getIdApp());
        System.out.println("El numero de IdAppMovil es: " + getIdAppMovil());
        System.out.println("El nombre del tipo de Aplicación seleccionada es: " + getNombre());
        System.out.println("Una aplicación web es un software que se ejecuta en el navegador web\n"
        + "Las empresas tienen que intercambiar información y proporcionar servicios\n"
        + "de forma remota. Utilizan aplicaciones web para comunicarse con los clientes\n"
        + "cuando lo necesiten y de una forma segura");
        System.out.println("El sistema Operativo que utiliza es: " + getSistemaOperativo());
        System.out.println("El lenguaje de programacion utilizado es: " + getLenguajeProgramacion());
    }
}
