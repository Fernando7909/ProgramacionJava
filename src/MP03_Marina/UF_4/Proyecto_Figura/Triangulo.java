package MP03_Marina.UF_4.Proyecto_Figura;

import java.util.Scanner;
public class Triangulo extends Figura {

    //Atributos:
    private int base;
    private int h;

    //Funciones Constructoras:
    public Triangulo(){}
    public Triangulo(int base, int h){
        this.base = base;
        this.h = h;
    }
    public Triangulo(String figura, int id, int base, int h) {
        super(figura, id);
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
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce la medida de base del Triangulo: ");
        int base = lector.nextInt();
        setBase(base);
        System.out.println("Introduce la medida de altura (h) del triangulo: ");
        int h = lector.nextInt();
        setH(h);

        return this.base * this.h;
    }
}
