package MP03_Marina.UF_4.Solucion_figura.Figura;

public class Figura {
    private String figura = "";
    private static int id = 0;
    
    public Figura(){
        ++id;
    }

    public Figura(String figura){
        this.figura = figura;
        ++id;
    }

    public String getFigura(){
        return this.figura;
    }

    public int getId() {
        return id;
    }

    public void setFigura(String novaFigura){
        this.figura = novaFigura;
    }
    public void setid(int id){
        this.id = id;
    }

    public void llegirDades(){
        ++id;

    }

    public void imprimirDades(){
        System.out.println("La figura amb id " +  getId() + " és un " + getFigura() + ".");
        System.out.println("L'àrea del " + getFigura() + " és: " + calcularArea());
        System.out.println("\n--------------\n");
        //seguentFigura();
    }

    /*private void seguentFigura(){
        System.out.println("Quina figura vols avaluar ara?");

    }*/

    public double calcularArea(){
        System.out.println("No imprimeixo res perquè no sóc cap figura en concret.");
        System.out.println("Sobreescfiure-me i et calcularé, per cada classe, l'àrea en menys 1s!");
        return 0;
    }
}
