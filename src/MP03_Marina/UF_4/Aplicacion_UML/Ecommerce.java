package MP03_Marina.UF_4.Aplicacion_UML;

public class Ecommerce extends Web{

    //CONSTRUCTORAS
    public Ecommerce(){}

    public Ecommerce(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion) {
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES / METODOS
    public String exlpicacionTipoApp(){
        System.out.println("En esencia, el comercio electrónico o ecommerce no es más que la\n"
        + "compra y venta de vienes y servicios a través de internet, cuando compras en línea");

        return null;
    }
}
