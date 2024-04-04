package MP03_Marina.UF_4.Herencia_multinivel;

public class Main {
    public static void main(String[] args){

        //Funciones Constructoras:
        Coche C = new Coche();
        C.tipoVehiculo();
        System.out.println("Su numero de id es: " + C.getId_coche());

        Seat Se = new Seat();
        Se.marca();
        Se.velocidad();

        Arona A = new Arona();
        A.color();
        A.km();
    }
}
