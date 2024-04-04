package MP03_Marina.UF_4.Empresa;

public class Transportista {

    //Atributos
    private String nombre;
    private int telefono;
    private int numLicencia;

    //Funcioes Constructoras
    public Transportista(String nombreTansportista, int telefonoTransportista, int numLicenciaTransportista) {
        this.nombre = nombreTansportista;
        this.telefono = telefonoTransportista;
        this.numLicencia = numLicenciaTransportista;
    }
    public Transportista(String nombreTransportista, int telefonoTransportista) {
        this.nombre = nombreTransportista;
        this.telefono = telefonoTransportista;
    }

    //Getters:
    public String getNombre(){
        return nombre;
    }
    public int getTelefono(){
        return telefono;
    }
    public int getNumLicencia(){
        return numLicencia;
    }

    //Setters:
    public void setNombre(String newName){
        this.nombre = newName;
    }
    public void setTelefono(int newPhone){
        this.telefono = newPhone;
    }
    public void setNumLicencia(int newNumLicencia){
        this.numLicencia = newNumLicencia;
    }

    //Funciones UML
    public void asignarEncargo(Encargo c){}
    public void eliminarEncargo(Encargo c){}
}
