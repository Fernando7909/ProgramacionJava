package MP03_Marina.UF_4.Aplicacion_UML;

public class Estatica extends Web{

    //CONSTRUCTORAS
    public Estatica(){}

    public Estatica(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion) {
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES/METODOS
    public String explicacionTipoApp(){
        System.out.println("Una aplicacion Web estática es lo que normalmente entendemo como\n"
        + "sitio web, y se caracteriza por lo siguiente: Se suelen desarrollan en HTML y CSS\n"
        + "y puede utilizarse algo de Java Script.");

        return null;
    }
}
