package MP03_Marina.UF_4.Proyecto_Figura;

public class Figura {

    //Atributos:
    private static int id = 0;  // le damos un valor aunque sea 0 o nulo
    private String figura = " ";


    //Funciones Constructoras:
    public Figura(){
        ++id;
    }
    public Figura(String figura){
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

    public void imprimirDatos(double area, String figura){
        System.out.println("La figura con id: " + getId() + " es un " + figura);
        System.out.println("El área del " + figura + " es de : " + area + " cm2.");
        System.out.println("\n");
        System.out.println("------------------------------------------------------------");
    }
}
