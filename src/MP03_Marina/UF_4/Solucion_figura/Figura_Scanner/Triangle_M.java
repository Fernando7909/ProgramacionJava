package MP03_Marina.UF_4.Solucion_figura.Figura_Scanner;

public class Triangle_M extends Figura_M {
    private int base;
    private int h;

    public Triangle_M(){
        super("triangle");
    }

    public Triangle_M(int a, int b){
        super("triangle");
        this.base = a;
        this.h = b;
    }

    public int getBase() {
        return base;
    }

    public int getH() {
        return h;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return (base+h)/2;
    }
}