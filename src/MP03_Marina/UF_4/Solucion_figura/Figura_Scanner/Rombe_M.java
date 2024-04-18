package MP03_Marina.UF_4.Solucion_figura.Figura_Scanner;

public class Rombe_M extends Figura_M {
    private int dM;
    private int dm;

    public Rombe_M(){
        super("rombe");
    }

    public Rombe_M(int dM, int dm){
        super("rombe");
        this.dM = dM;
        this.dm = dm;
    }

    public int getdM() {
        return dM;
    }

    public int getDm() {
        return dm;
    }

    public void setdM(int dM) {
        this.dM = dM;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    @Override
    public double calcularArea() {
        return ((getdM()*getDm())/2);
    }
}