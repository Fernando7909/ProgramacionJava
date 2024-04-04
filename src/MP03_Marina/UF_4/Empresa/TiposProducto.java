package MP03_Marina.UF_4.Empresa;

public class TiposProducto {

    //Atributos
    private String nombre;
    private int codiIdentificador;
    private double precio;
    private int stock;
    private boolean aLaVenta;

    //Función Constructora
    public TiposProducto(String nombreProducto, int codiIdentificadorProducto, double precioProducto, int stockProducto, boolean aLaVentaProducto) {
        this.nombre = nombreProducto;
        this.codiIdentificador = codiIdentificadorProducto;
        this.precio = precioProducto;
        this.stock = stockProducto;
        this.aLaVenta = aLaVentaProducto;
    }

    //Getters:
    public String getNombre(){
        return nombre;
    }
    public int getCodiIdentificador(){
        return codiIdentificador;
    }
    public double getPrecio(){return precio;}
    public int getStock(){
        return stock;
    }
    public boolean getAlaVenta(){
        return aLaVenta;
    }

    //Setters;
    public void setNombre(String newName){
        this.nombre = newName;
    }
    public void setCodiIdentificador(int newCodiIdentificador){
        this.codiIdentificador = newCodiIdentificador;
    }
    public void setPrecio(double newPrice){
        this.precio = newPrice;
    }
    public void setStock(int newStock){
        this.stock = newStock;
    }
    public void setaLaVenta(boolean newAlaVenta){
        this.aLaVenta = newAlaVenta;
    }
}
