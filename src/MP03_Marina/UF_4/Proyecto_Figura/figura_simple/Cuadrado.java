package MP03_Marina.UF_4.Proyecto_Figura.figura_simple;

import java.util.Scanner;

public class Cuadrado extends Figura {

    //Atributos:
    private int lado;

    //Funciones Constructoras:
    public Cuadrado(){
        super("Cuadrado");
    }

    public Cuadrado(int lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    //Getters:
    public int getLado(){
        return lado;
    }

    //Setters:
    public void setLado(int lado){
        this.lado = lado;
    }

    //Otras Funciones:
    @Override
    public double calcularArea(){
        return this.lado * this.lado;
    }
}
