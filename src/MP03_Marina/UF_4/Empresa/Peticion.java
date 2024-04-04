package MP03_Marina.UF_4.Empresa;

public class Peticion {

    //Atributos
    private int cantidad;

    //Función Constructora
    public Peticion(int cantidad) {
        this.cantidad = cantidad;
    }

    //Getters:
    public int getCantidad(){
        return cantidad;
    }

    //Setters:
    public void setCantidad(int numCantidad){
        this.cantidad = numCantidad;
    }

    //Funcion UML
    public void asignarProducto(TiposProducto p){}
}
