package MP03_Marina.UF_4.Aplicacion_UML;

import java.util.Scanner;

public class Movil extends Aplicacion{

    //ATRIBUTOS
    private static int idAppMovil = 0;

    //CONSTRUCTORAS
    public Movil(){}

    public Movil(String nombre, String descripcion, String sistemaOperativo, String lenguajeProgramacion){
        super(nombre, descripcion, sistemaOperativo, lenguajeProgramacion);
    }

    //GETTERS
    public static int getIdAppMovil() {
        return idAppMovil;
    }

    //SETTERS
    public static void setIdAppMovil(int idAppMovil) {
        Movil.idAppMovil = idAppMovil;
    }

    //OTRAS FUNCIONES
    public boolean eliminarId(int idApp){
        return false;
    }
    public void crearAplicacionMovil(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Dentro de las Aplicaciones Movil, tenemos 3 tipos: ");
        System.out.println("Nativa, Hibrida, WebApp");
        System.out.println("Selecciona una de ellas: ");
        boolean opcionValida4 = false;

        while (!opcionValida4){
            String opcion4 = lector.nextLine().toUpperCase();
            switch (opcion4) {
                case "NATIVA":
                    Nativa nativa = new Nativa();
                    nativa.explicacionTipoApp();
                    opcionValida4 = true;
                    break;
                case "HIBRIDA":
                    Hibrida hibrida = new Hibrida();
                    hibrida.explicacionTipoApp();
                    opcionValida4 = true;
                    break;
                case "WEBAPP":
                    WebApp webapp = new WebApp();
                    webapp.explicacionTipoApp();
                    opcionValida4 = true;
                    break;
                default:
                    System.out.println("Opcion NO valida.");
            }
        }
        lector.close();
    }
    public boolean aplicacionCreada(){
        return false;
    }
}
