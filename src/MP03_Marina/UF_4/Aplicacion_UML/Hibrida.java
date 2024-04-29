package MP03_Marina.UF_4.Aplicacion_UML;

public class Hibrida extends Movil{

    //CONSTRUCTORAS
    public Hibrida(){}

    public Hibrida(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion){
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES
    public String explicacionTipoApp(){
        System.out.println("Las aplicaciones hibridas son un tipo de aplicaciones movil que combina\n"
        + "características de las aplicaciones nativas y web. Estas se construyen utilizando\n"
        + "tecnologías para el desarrollo web, como en los elementos estructurales de HTML5, CSS3 y JavaScript");

        return null;
    }
}
