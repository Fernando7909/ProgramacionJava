package MP03_Marina.UF_4.Aplicacion_UML;

public class CMS extends Web{

    //CONSTRUCTORA

    public CMS() {}

    public CMS(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion) {
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //OTRAS FUNCIONES / METODOS
    public String explicacionTipoApp(){
        System.out.println("Un gestor de contenidos web es una aplicacion informática usada para\n"
        + "crear, editar, gestionar y publicar contenidos en diversos formatos en el entorno web");

        return null;
    }
}
