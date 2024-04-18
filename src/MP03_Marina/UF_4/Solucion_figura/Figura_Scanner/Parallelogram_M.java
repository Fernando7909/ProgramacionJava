package MP03_Marina.UF_4.Solucion_figura.Figura_Scanner;

public class Parallelogram_M extends Figura_M {
    private int b;
    private int h;

    public Parallelogram_M(){
        super("paralellogram");
    }

    public Parallelogram_M(int b, int h){
        super("paralellogram");
        this.b = b;
        this.h = h;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return getB()*getH();
    }
}