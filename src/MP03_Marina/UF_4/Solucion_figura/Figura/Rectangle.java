package MP03_Marina.UF_4.Solucion_figura.Figura;

public class Rectangle extends Figura{

    private int costat1 = 0;
    private int costat2 = 0;

    public Rectangle(){
        super("rectangle");
    }

    public Rectangle(int c1, int c2){
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
        return this.costat1 * this.costat2;
    }
}
