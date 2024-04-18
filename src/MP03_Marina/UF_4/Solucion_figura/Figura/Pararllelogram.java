package MP03_Marina.UF_4.Solucion_figura.Figura;

public class Pararllelogram extends Figura{

    private int b = 0;
    private int h = 0;

    public Pararllelogram(){
        super("parallelogram");
    }

    public Pararllelogram(int b, int h){
        super("parallelogram");
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
        return this.b * this.h;
    }
}
