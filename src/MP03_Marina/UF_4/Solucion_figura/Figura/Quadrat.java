package MP03_Marina.UF_4.Solucion_figura.Figura;

public class Quadrat extends Figura{

    private int radi = 0;

    public Quadrat(){
        super("quadrat");
    }

    public Quadrat(int r){
        super("quadrat");
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
        return this.radi*2;
    }
}
