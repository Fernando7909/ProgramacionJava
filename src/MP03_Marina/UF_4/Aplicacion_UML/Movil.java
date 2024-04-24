package MP03_Marina.UF_4.Aplicacion_UML;

public class Movil extends Aplicacion{

    //ATRIBUTOS
    private static int idAppMovil = 0;

    //CONSTRUCTORAS
    public Movil(){}

    public Movil(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion){
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //GETTERS
    public static int getIdAppMovil() {
        return idAppMovil;
    }

    //SETTERS
    public static void setIdAppMovil(int idAppMovil) {
        Movil.idAppMovil = idAppMovil;
    }

    //OTRAS FUNCIONES
    public boolean eliminarId(int idApp){
        return false;
    }
    public String crearAplicacionWMovil(){
        return "Aplicacion Movil";
    }
    public boolean aplicacionCreada(){
        return false;
    }
}
