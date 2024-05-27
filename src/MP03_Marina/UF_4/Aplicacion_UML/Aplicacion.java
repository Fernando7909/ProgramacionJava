package MP03_Marina.UF_4.Aplicacion_UML;

public class Aplicacion {

    //ATRIBUTOS
    private static int idApp = 0;
    private String nombre = "";
    private String descripcion = "";
    private String sistemaOperativo = "";
    private String lenguajeProgramacion = "";

    //CONSTRUCTORAS
    public Aplicacion(){}
    public Aplicacion(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion){
        ++idApp;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.sistemaOperativo = sistemaOperativo;
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    //GETTERS
    public int getIdApp(){
        return idApp;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getSistemaOperativo(){
        return sistemaOperativo;
    }
    public String getLenguajeProgramacion(){
        return lenguajeProgramacion;
    }

    //SETTERS
    public void setIdApp(int idApp){
        this.idApp = idApp;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }
    public void setLenguajeProgramacion(String lenguajeProgramacion){
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    //OTRAS FUNCIONES / METODOS
    public boolean aplicacionCreada(){
        return true;
    }
}
