package MP03_Marina.UF_4.Proyecto_Figura.figura_simple;

import java.util.Scanner;
public class Circulo extends Figura{

    //Atributos
    private int radio = 0;

    //Funciones Constructoras:
    public Circulo(){
        super("Circulo");
    }

    public Circulo(int radio) {
        super("Circulo");
        this.radio = radio;
    }

    public Circulo(String figura, int id, int radio) {
        super(figura);
        this.radio = radio;
    }

    //Getters:
    public int getRadio(){
        return radio;
    }

    //Setters:
    public void setRadio(int radio){
        this.radio = radio;
    }

    //Otras Funciones:
    public void Circulo(int r){}
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
}
