package MP03_Marina.UF_4.Proyecto_Figura.figura_simple;

import java.util.Scanner;
public class Rectangulo extends Figura {

    //Atributos:
    private int lado1;
    private int lado2;

    //Funciones Constructoras:
    public Rectangulo(){
        super("Rectangulo");
    }

    public Rectangulo(int lado1, int lado2) {
        super("Rectangulo");
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Getters:
    public int getLado1(){
        return lado1;
    }
    public int getLado2(){
        return lado2;
    }

    //Setters:
    public void setLado1(int lado1){
        this.lado1 = lado1;
    }
    public void setLado2(int lado2){
        this.lado2 = lado2;
    }

    //Otras Funciones:
    public void Rectangulo(int c1, int c2){}
    @Override
    public double calcularArea(){
        return this.lado1 * this.lado2;
    }
}
