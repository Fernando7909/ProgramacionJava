package MP03_Marina.UF_4.Herencia_multinivel;

public class Seat extends Coche{

    //Atributos:
    private String model;

    //Funciones constructoras:
    public Seat(){}
    public Seat(int id_coche, String model) {
        super(id_coche);
        this.model = model;
    }

    //Getters:
    public String getModel() {
        return model;
    }

    //Setters:
    public void setModel(String model) {
        this.model = model;
    }

    //Funciones:

    public void marca(){
        System.out.println("La marca del coche es Seat");
    }
    public void velocidad(){
        System.out.println("La velocidad del coche es 100 km/h");
    }
}
