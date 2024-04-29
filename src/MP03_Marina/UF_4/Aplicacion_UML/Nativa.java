package MP03_Marina.UF_4.Aplicacion_UML;

public class Nativa extends Movil{

    //CONSTRUCTORAS
    public Nativa(){}
    public Nativa(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion){
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES
    public String explicacionTipoApp(){
        System.out.println("Se llaman aplicaciones nativas debido a que se desarrollan para el\n"
        + "sistema operativo nativo de cada dispositivo. Este tipo de aplicaciones moviles son\n"
        + "aquillas que nos descargamos en las tiendas de apps como pueden ser Play Store\n"
        + "(Android) y App Store (iOS)");

        return null;
    }
}
