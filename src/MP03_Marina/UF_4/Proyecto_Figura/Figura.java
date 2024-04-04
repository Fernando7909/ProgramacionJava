package MP03_Marina.UF_4.Proyecto_Figura;

public class Figura {

    //Atributos:
    private int id;
    private String figura;


    //Funciones Constructoras:
    public Figura(){}
    public Figura(String figura, int id){
        this.id = id;
        this.figura = figura;
    }

    //Getters:
    public String getFigura(){
        return figura;
    }
    public int getId(){
        return id;
    }


    //Setters:
    public void setFigura(String figura){
        this.figura = figura;
    }
    public void setId(int id) {
        this.id = id;
    }


    //Otras Funciones:
    public double calcularArea(){
        return 0.0;
    }
}
