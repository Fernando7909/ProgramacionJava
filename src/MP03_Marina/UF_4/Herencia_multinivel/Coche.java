package MP03_Marina.UF_4.Herencia_multinivel;

public class Coche {

    //Atributos:
    private static int id_coche = 0;

    //Funcion Constructora:

    public Coche(){}
    public Coche(int id_coche) {
        this.id_coche = ++id_coche;
    }

    //Getters:
    public int getId_coche() {
        return id_coche;
    }

    //Setters:
    public void setId_coche(int id_coche) {
        this.id_coche = id_coche;
    }

    //Funciones:
    public void tipoVehiculo(){
        System.out.println("Este vehiculo es un coche");
    }
}
