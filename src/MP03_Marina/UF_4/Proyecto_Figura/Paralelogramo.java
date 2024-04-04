package MP03_Marina.UF_4.Proyecto_Figura;

import java.util.Scanner;

public class Paralelogramo extends Figura{

    //Atributos:
    private int b;
    private int h;

    //Funciones constructoras:
    public Paralelogramo(){}
    public Paralelogramo(int b, int h){
        this.b = b;
        this.h = h;
    }
    public Paralelogramo(String figura, int id, int b, int h) {
        super(figura, id);
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
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce la medida de un lado del Paralelogramo: ");
        setB(b = lector.nextInt());
        System.out.println("Introduce la medida de altura (h) del Paralelogramo: ");
        setH(h = lector.nextInt());

        return this.b * this.h;
    }
}
