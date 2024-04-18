package MP03_Marina.UF_4.Solucion_figura.Figura_Scanner;

import java.util.Scanner;

public class Figura_M {
    Scanner s = new Scanner(System.in);
    private String figura;
    private static int id = 0;

    public Figura_M(){
    }
    public Figura_M(String fig){
        ++id;
        this.figura=fig;
        System.out.println(id);
    }

    public int getId() {
        return id;
    }

    public String getFigura() {
        return figura;
    }

    public void setId(int id) {
        Figura_M.id = id;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    //Donem a escollir l'usuari de quina figura vol calcular l'àrea i controlem que el que escrigui sigui una de les figures.
    public String llegirDades(){
        do {
            System.out.println("Escull entre d'aquestes de quina figura vols calcular l'àrea:\ntriangle, quadrat, rectangle, trapezi, parallelogram, rombe o cercle.");
            figura = s.nextLine();
        }while(!figura.equalsIgnoreCase("Triangle") && !figura.equalsIgnoreCase("Quadrat") && !figura.equalsIgnoreCase("Rectangle") && !figura.equalsIgnoreCase("Trapezi") && !figura.equalsIgnoreCase("Parallelogram") && !figura.equalsIgnoreCase("Rombe") && !figura.equalsIgnoreCase("Cercle"));
        return figura;
    }

    //Imprimim les dades de la figura escollida després d'haver fet els càlculs pertinents.
    public void imprimirDades(){
        System.out.println("La figura amb id " + getId() + " és un " + getFigura() + ".");
        System.out.println("L'àrea del " + getFigura() + " és: " + calcularArea() + "\n\n--------------\n");
    }

    public double calcularArea(){
        return 0;
    }
}