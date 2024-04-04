package MP03_Marina.UF_4.Proyecto_Figura;

import java.util.Scanner;

public class Rombo extends Figura {

    //Atributos:
    private int dM;
    private int dm;

    //Funciones Constructoras:
    public Rombo(){}
    public Rombo(int dM, int dm){
        this.dM = dM;
        this. dm = dm;
    }
    public Rombo(String figura, int id, int dM, int dm) {
        super(figura, id);
        this.dM = dM;
        this.dm = dm;
    }

    //Getters:
    public int getDM(){
        return dM;
    }
    public int GetDm(){
        return dm;
    }

    //Setters:
    public void setDM(int dM){
        this.dM = dM;
    }
    public void setDm(int dm){
        this.dm = dm;
    }

    //Otras Funciones:
    public void Rombo(int dM, int dm){}
    @Override
    public double calcularArea(){
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce la medida del Diagonal Mayor del Rombo: ");
        setDM(dM = lector.nextInt());
        System.out.println("Introduce la medida del Diagonal Menor del Rombo: ");
        setDm(dm = lector.nextInt());

        return this.dM * this.dm / 2;
    }
}
