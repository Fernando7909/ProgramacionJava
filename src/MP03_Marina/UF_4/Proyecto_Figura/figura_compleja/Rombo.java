package MP03_Marina.UF_4.Proyecto_Figura.figura_compleja;

import java.util.Scanner;

public class Rombo extends Figura {

    //Atributos:
    private int dM;
    private int dm;

    //Funciones Constructoras:
    public Rombo(){
        super("Rombo");
    }

    public Rombo(int dM, int dm) {
        super("Rombo");
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
        return this.dM * this.dm / 2;
    }
}
