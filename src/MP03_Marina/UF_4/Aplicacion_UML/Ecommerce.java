package MP03_Marina.UF_4.Aplicacion_UML;

public class Ecommerce extends Web{

    //CONSTRUCTORAS
    public Ecommerce(){
        super("Alibaba", "Descripción", "Windows", "JavaScript");
    }

    public Ecommerce(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion) {
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES / METODOS
    public void exlpicacionTipoApp(){
        System.out.println("La aplicacion ha sido creada? " + aplicacionCreada());
        System.out.println("El numero de Id de la App es: " + getIdApp());
        System.out.println("El nuemro de Id de la Web es: " + getIdAppWeb());
        System.out.println("El nombre del tipo de Aplicación seleccionada es: " + getNombre());
        System.out.println("En esencia, el comercio electrónico o ecommerce no es más que la\n"
        + "compra y venta de vienes y servicios a través de internet, cuando compras en línea");
        System.out.println("El sistema Operativo que utiliza es: " + getSistemaOperativo());
        System.out.println("El lenguaje de programacion utilizado es: " + getLenguajeProgramacion());
    }
}
