package MP03_Marina.UF_4.Proyecto_Figura;

public class Figura {

    //Atributos:
    private int id = 0;  // le damos un valor aunque sea 0 o nulo
    private String figura = " ";


    //Funciones Constructoras:
    public Figura(){
        ++id;
    }
    public Figura(String figura){
        this.figura = figura;
        ++id;
    }

    //Getters:
    public String getFigura(){
        return figura;
    }
    public int getId(){
        return this.id;
    }


    //Setters:
    public void setFigura(String figura){
        this.figura = figura;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getArea(){
        return 5;
    }

    //Otras Funciones:
    public double calcularArea(){
        return 0.0;
    }
}
