package MP03_Marina.UF_4.Solucion_figura.Figura;

public class MainFigura {
    public static void main(String[] args) {
        Triangle t = new Triangle(23,12);
        t.imprimirDades();

        Quadrat q = new Quadrat(3);
        q.imprimirDades();

        Rectangle r = new Rectangle();
        r.setCostat1(12);
        r.setCostat2(8);
        r.imprimirDades();

        Trapezi tr = new Trapezi(15,5,6);
        tr.imprimirDades();

        Rombe rb = new Rombe(12,3);
        rb.imprimirDades();

        Pararllelogram pl = new Pararllelogram(7,2);
        pl.imprimirDades();

        Cercle c = new Cercle(23);
        c.imprimirDades();
    }
}