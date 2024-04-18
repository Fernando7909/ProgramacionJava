package MP03_Marina.UF_4.Proyecto_Figura.figura_simple;

import java.util.Scanner;
public class Triangulo extends Figura {

    //Atributos:
    private int base;
    private int h;

    //Funciones Constructoras:
    public Triangulo(){
        super("Triangulo");
    }

    public Triangulo(int base, int h) {
        super("Triangulo");
        this.base = base;
        this.h = h;
    }

    //Getters:
    public int getBase(){
        return base;
    }
    public int getH(){
        return h;
    }

    //Setters:
    public void setBase(int base){
        this.base = base;
    }
    public void setH(int h){
        this.h = h;
    }

    //Otras funciones:
    public void Triangulo(int a, int b){}

    @Override
    public double calcularArea(){
        return this.base * this.h;
    }
}
