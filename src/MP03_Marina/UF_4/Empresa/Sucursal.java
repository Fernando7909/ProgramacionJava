package MP03_Marina.UF_4.Empresa;

public class Sucursal {

    //Atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;


    //Función Constructora
    public Sucursal(String nombreSucursal, String direccionSucursal, String telefonoSucursal, String emailSucursal) {
        this.nombre = nombreSucursal;
        this.direccion = direccionSucursal;
        this.telefono = telefonoSucursal;
        this.email = emailSucursal;
    }
    public Sucursal(String nombreSucursal, String direccionSucursal){
        this.nombre = nombreSucursal;
        this.direccion = direccionSucursal;
    }
    public Sucursal(String nombreSucursal){
        this.nombre = nombreSucursal;
    }
    //Si creamos mas de una constructora con el mismo numero de atributos y del mismo tipo de dato, ERROR


    //Getters:
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getEmail(){
        return email;
    }

    //Setters
    public void setNombre(String newName){
        this.nombre = newName;
    }
    public void setDireccion(String newAddress){
        this.direccion = newAddress;
    }
    public void setTelefono(String newPhone){
        this.telefono = newPhone;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    //Funciones UML
    public void descanso(Transportista t){}
    public void trabajo(Transportista t){}
    public void altaCliente(Cliente c){}
    public void bajaCliente(Cliente c){}
    public void altaEncargo(Cliente c, Transportista t, Encargo e){}
    public void anularEncargo(Encargo e){}
}
