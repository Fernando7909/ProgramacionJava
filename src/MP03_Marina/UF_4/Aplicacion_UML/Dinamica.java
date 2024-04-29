package MP03_Marina.UF_4.Aplicacion_UML;

public class Dinamica extends Web{

    //CONSTRUCTORA
    public Dinamica(){}

    public Dinamica(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion) {
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES / METODOS

    public String explicacionTipoApp(){
        System.out.println("Las aplicaciones web dinamicas son una herramienta que se vale\n"
        + " de una base de datos para cargar la información y el contenido varía cada vez\n"
        + "que un usuario accede a ellas.");

        return null;
    }
}
