package MP03_Marina.UF_4.Proyecto_Figura.figura_compleja;

public class Figura {

    //Atributos:
    private static int id = 0;  // le damos un valor aunque sea 0 o nulo
    private String figura = "";


    //Funciones Constructoras:
    public Figura(){}
    public Figura(String figura){
        ++id;
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
        Figura.id = id;
    }

    //Otras Funciones:
    public double calcularArea(){
        return 0.0;
    }

    public void imprimirDatos() {
        System.out.println("La figura con id: " + getId() + " es un " + getFigura());
        System.out.println("El área del " + getFigura() + " es de : " + calcularArea());
        System.out.println("------------------------------------------------------------");
    }
}
