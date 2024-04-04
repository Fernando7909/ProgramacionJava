package MP03_Marina.UF_4.Herencia_Simple;

public class Persona {

    //Atributos:
    private static int id;
    private int edad;
    private String nombre;
    private String apellido;
    private String direccion;


    //Funciones Constructoras:
    public Persona(){}
    public Persona(int id, int edad, String nombre, String apellido, String direccion) {
        //id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    //Getters:
    public int getId() {
        return id;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDireccion() {
        return direccion;
    }

    //Setters:
    public void setId(int id) {
        this.id = id;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
