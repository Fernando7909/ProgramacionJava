package MP03_Marina.UF_4.Creacion_ejemplo;

public class rectangulo {

    /* Atributos de la clase rectángulo. A continuación definimos
    sus características o parametros. */
    private int base;
    private int altura;
    private String color;


    public rectangulo(){}
    public rectangulo(String col){
        color = col;
    }
    public rectangulo(int base, int altu, String col){
        // base = base; Si tiene el mismo nombre, NO hace falta renombrarla
        altura = altu;
        color = col;
    }
    public String getcolor(){
        return color;
    }
    public void setcolor(String Naranja){
        this.color = "Naranja";
    }
}
