package MP03_Marina.UF_4.Proyecto_Figura;

import java.util.Scanner;

public class Trapecio extends Figura{

    //Atributos:
    private int a;
    private int b;
    private int h;

    //Funciones Constructoras:
    public Trapecio(){}
    public Trapecio(int a, int b, int h){
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public Trapecio(String figura, int id, int a, int b, int h) {
        super(figura);
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
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce la medida del 1º lado del Trapecio: ");
        setA(a = lector.nextInt());
        System.out.println("Introduce la medida del 2º lado del Trapecio: ");
        setB(b = lector.nextInt());
        System.out.println("Introduce la medida de altura (h) del Trapecio: ");
        setH(h = lector.nextInt());

        return (this.a + this.b)*h / 2;
    }
}
