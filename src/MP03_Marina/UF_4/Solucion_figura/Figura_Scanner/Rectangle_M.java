package MP03_Marina.UF_4.Solucion_figura.Figura_Scanner;

public class Rectangle_M extends Figura_M {
    private int costat1;
    private int costat2;

    public Rectangle_M(){
        super("rectangle");
    }

    public Rectangle_M(int c1, int c2){
        super("rectangle");
        this.costat1 = c1;
        this.costat2 = c2;
    }
    public int getCostat1() {
        return costat1;
    }

    public int getCostat2() {
        return costat2;
    }

    public void setCostat1(int costat1) {
        this.costat1 = costat1;
    }

    public void setCostat2(int costat2) {
        this.costat2 = costat2;
    }

    @Override
    public double calcularArea() {
        return getCostat1() * getCostat2();
    }
}