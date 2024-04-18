package MP03_Marina.UF_4.Solucion_figura.Figura;

public class Triangle extends Figura{
    private int base = 0;
    private int h = 0;

    public Triangle(){
        super("triangle");
    }

    public Triangle (int b, int h){
        super("triangle");
        this.base = b;
        this.h = h;
        //setFigura("triangle");
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
        return this.base * this.h;
    }

}
