package MP03_Marina.UF_4.Proyecto_Figura.figura_simple;

import java.util.Scanner;

public class Paralelogramo extends Figura{

    //Atributos:
    private int b;
    private int h;

    //Funciones constructoras:
    public Paralelogramo(){
        super("Paralelogramo");
    }

    public Paralelogramo(int b, int h) {
        super("Paralelogramo");
        this.b = b;
        this.h = h;
    }

    //Getters:
    public int getB(){
        return b;
    }
    public int getH(){
        return h;
    }

    //Setters:
    public void setB(int b){
        this.b = b;
    }
    public void setH(int h){
        this.h = h;
    }

    //Otras Funciones:
    public void Paralelogramo(int b, int h){}
    @Override
    public double calcularArea(){
        return this.b * this.h;
    }
}
