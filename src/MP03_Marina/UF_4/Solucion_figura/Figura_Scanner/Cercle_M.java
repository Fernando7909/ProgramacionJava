package MP03_Marina.UF_4.Solucion_figura.Figura_Scanner;

public class Cercle_M extends Figura_M {
    private int radi;

    public Cercle_M(){
        super("cercle");
    }

    public Cercle_M(int r){
        super("cercle");
        this.radi = r;
    }

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(getRadi(), 2) * Math.PI);
    }
}