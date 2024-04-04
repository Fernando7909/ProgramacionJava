package MP03_Marina.UF_4.Media;

public class Media {

    //Atributos:
    private String nombre;
    private int duracion;

    //Funcion Constructora;
    public Media(){}
    public Media(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    //Getters:
    public String getNombre() {
        return nombre;
    }
    public int getDuracion() {
        return duracion;
    }

    //Setters:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
