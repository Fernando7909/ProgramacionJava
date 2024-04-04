package MP03_Marina.UF_4.Herencia_multinivel;

public class Arona extends Seat{

    //Atributos:
    private String color;
    private String km;

    //Funcion Constructora:
    public Arona(){}
    public Arona(int id_coche, String model, String color, String km) {
        super(id_coche, model);
        this.color = color;
        this.km = km;
    }

    //Getters:
    public String getColor() {
        return color;
    }
    public String getKm() {
        return km;
    }

    //Setters:
    public void setColor(String color) {
        this.color = color;
    }
    public void setKm(String km) {
        this.km = km;
    }

    //Otras funciones:
    public void color(){
        System.out.println("El color del coche es rojo.");
    }
    public void km(){
        System.out.println("Este coche tiene 100.000km ");
    }
}
