package MP03_Marina.UF_4.Proyecto_Figura;

import java.util.Scanner;

public class Cuadrado extends Figura {

    //Atributos:
    private int lado;

    //Funciones Constructoras:
    public Cuadrado(){}
    public Cuadrado(int lado){
        this.lado = lado;
    }
    public Cuadrado(String figura, int id, int lado) {
        super(figura);
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
    public void Cuadrado(int r){}
    @Override
    public double calcularArea(){
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce la medida de un lado del Cuadrado: ");
        setLado(lado = lector.nextInt());

        return this.lado * this.lado;
    }
}
