package MP03_Marina.UF_4.Aplicacion_UML;

public class Web extends Aplicacion{

    //ATRIBUTOS
    private static int idAppWeb = 0;

    //CONSTRUCTORA
    public Web() {}

    public Web(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion) {
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //GETTERS
    public static int getIdAppWeb() {
        return idAppWeb;
    }

    //SETTERS
    public static void setIdAppWeb(int idAppWeb) {
        Web.idAppWeb = idAppWeb;
    }

    //OTRAS FUNCIONES
    public boolean eliminarId(int idApp){
        return false;
    }
    public String crearAplicacionWeb(){
        return "AplicacionWeb";
    }
    public boolean aplicacionCreada(){
        return false;
    }
}
