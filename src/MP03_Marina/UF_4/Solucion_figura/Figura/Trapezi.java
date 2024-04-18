package MP03_Marina.UF_4.Solucion_figura.Figura;

public class Trapezi extends Figura{

    private int a = 0; //base gran del trapezi
    private int b = 0; //base petita del trapezi
    private int h = 0; //alcçada trapezi

    public Trapezi(){
        super("trapezi");
    }

    public Trapezi (int a, int b, int h){
        super("trapezi");
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double calcularArea() {
        return ((this.a*this.b)*this.h)/2;
    }
}
