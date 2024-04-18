package MP03_Marina.UF_4.Solucion_figura.Figura;

public class Rombe extends Figura{

    private int dM = 0; //diametre gran
    private int dm = 0; //diametre petit

    public Rombe(){
        super("rombe");
    }

    public Rombe(int dM, int dm){
        super("rombe");
        this.dM = dM;
        this.dm = dm;
    }

    public int getDm() {
        return dm;
    }

    public int getdM() {
        return dM;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    public void setdM(int dM) {
        this.dM = dM;
    }

    @Override
    public double calcularArea() {
        return (this.dM*this.dm)/2;
    }
}
