package MP03_Marina.UF_4.Proyecto_Figura.figura_simple;

import java.util.Scanner;

public class Trapecio extends Figura{

    //Atributos:
    private int a;
    private int b;
    private int h;

    //Funciones Constructoras:
    public Trapecio(){
        super("trapecio");
    }

    public Trapecio(int a, int b, int h) {
        super("Trapecio");
        this.a = a;
        this.b = b;
        this.h = h;
    }

    //Getters:
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getH(){
        return h;
    }

    //Setters:
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void setH(int h){
        this.h = h;
    }

    //Otras Funciones:
    public void Trapecio(int a, int b, int h){}
    @Override
    public double calcularArea(){
        return (this.a + this.b)*h / 2;
    }
}
