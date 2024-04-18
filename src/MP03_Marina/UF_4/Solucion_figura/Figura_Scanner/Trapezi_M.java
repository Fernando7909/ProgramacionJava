package MP03_Marina.UF_4.Solucion_figura.Figura_Scanner;

public class Trapezi_M extends Figura_M {
    private int a;
    private int b;
    private int h;

    public Trapezi_M(){
        super("trapezi");
    }

    public Trapezi_M(int a, int b, int h){
        super("trapezi");
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return ((getA()*getB())*getH())/2;
    }
}