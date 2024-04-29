package MP03_Marina.UF_4.Aplicacion_UML;

public class WebApp extends Movil{

    //CONSTRUCTORAS
    public WebApp() {}

    public WebApp(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion) {
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES
    public String explicacionTipoApp(){
        System.out.println("Una aplicación web es un software que se ejecuta en el navegador web\n"
        + "Las empresas tienen que intercambiar información y proporcionar servicios\n"
        + "de forma remota. Utilizan aplicaciones web para comunicarse con los clientes\n"
        + "cuando lo necesiten y de una forma segura");

        return null;
    }
}
