package MP03_Marina.UF_4.Aplicacion_UML;

public class CMS extends Web{

    //CONSTRUCTORA

    public CMS() {
        super("Wordpress", "Descripcion", "Linux", "PHP");
    }

    public CMS(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion) {
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES / METODOS
    public void explicacionTipoApp(){
        System.out.println("La aplicacion ha sido creada? " + aplicacionCreada());
        System.out.println("El numero de Id de la App es: " + getIdApp());
        System.out.println("El numero de IdAppWeb es: " + getIdAppWeb());
        System.out.println("Un gestor de contenidos web es una aplicacion informática usada para\n"
        + "crear, editar, gestionar y publicar contenidos en diversos formatos en el entorno web");
        System.out.println("El sistema Operativo que utiliza es: " + getSistemaOperativo());
        System.out.println("El lenguaje de programacion utilizado es: " + getLenguajeProgramacion());
    }
}
