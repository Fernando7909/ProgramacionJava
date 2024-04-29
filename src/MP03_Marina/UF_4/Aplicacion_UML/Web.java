package MP03_Marina.UF_4.Aplicacion_UML;
import java.util.Scanner;

public class Web extends Aplicacion{

    //ATRIBUTOS
    private static int idAppWeb = 0;

    //CONSTRUCTORA
    public Web() {}

    public Web(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion) {
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //GETTERS
    public static int getIdAppWeb() {
        return idAppWeb;
    }

    //SETTERS
    public static void setIdAppWeb(int idAppWeb) {
        Web.idAppWeb = idAppWeb;
    }

    //OTRAS FUNCIONES
    public boolean eliminarId(int idApp){
        return false;
    }
    public void crearAplicacionWeb(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Dentro de las Aplicaciones WEB, tenemos 4 tipos: ");
        System.out.println("Estática, Dinámica, Ecommerce y CMS");
        System.out.println("Selecciona una de ellas: ");
        boolean opcionValida3 = false;

        while (!opcionValida3) {
            String opcion3 = lector.nextLine().toUpperCase();
            switch (opcion3) {
                case "ESTATICA":
                    Estatica estatica = new Estatica();
                    estatica.explicacionTipoApp();
                    opcionValida3 = true;
                    break;
                case "DINAMICA":
                    Dinamica dinamica = new Dinamica();
                    dinamica.explicacionTipoApp();
                    opcionValida3 = true;
                    break;
                case "ECOMMERCE":
                    Ecommerce ecommerce = new Ecommerce();
                    ecommerce.exlpicacionTipoApp();
                    opcionValida3 = true;
                    break;
                case "CMS":
                    CMS cms = new CMS();
                    cms.explicacionTipoApp();
                    opcionValida3 = true;
                    break;
                default:
                    System.out.println("Opcion NO valida.");
            }
        }
    }
    public boolean aplicacionCreada(){
        return false;
    }

}
