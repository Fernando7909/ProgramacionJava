package MP03_Marina.UF_4.Empresa;

public class Cliente {

    //Atributos
    private String nombre;
    private String direccion;
    private int telefono;
    private String email;

    //Funcion Constructora
    public Cliente(String nombreCliente, String direccionCliente, int telefonoCliente, String emailCliente) {
        this.nombre = nombreCliente;
        this.direccion = direccionCliente;
        this.telefono = telefonoCliente;
        this.email = emailCliente;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getEmail(){
        return email;
    }

    //Setters
    public void setNombre(String Marcos){
        this.nombre = Marcos;
    }
    public void setDireccion(String newAddress){
        this.direccion = newAddress;
    }
    public void setTelefono(int newPhone){
        this.telefono = newPhone;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    //Funciones UML
    public void asignarEncargo(Encargo e){}
    public void eliminarEncargo(Encargo e){}

}
