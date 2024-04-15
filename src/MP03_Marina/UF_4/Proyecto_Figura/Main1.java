package MP03_Marina.UF_4.Proyecto_Figura;

public class Main1 {
    public static void main(String[] args) {

        // Funciones Constructoras:
        //Figura Fig0 = new Figura();
        Triangulo Tri0 = new Triangulo();
        //System.out.println(Tri0.getId());
        Cuadrado Cu0 = new Cuadrado();
        System.out.println(Tri0.getId());
        System.out.println(Cu0.getId());
        Rectangulo Re0 = new Rectangulo();
        Trapecio Tra0 = new Trapecio();
        Rombo Ro0 = new Rombo();
        Paralelogramo Pa0 = new Paralelogramo();
        Circulo Ci0 = new Circulo();

        Figura[] array_figuras = {Tri0, Cu0, Re0, Tra0, Ro0, Pa0, Ci0};

        for (Figura figura : array_figuras ){
            System.out.println("La figura con id: " + figura.getId() + " es un " +  figura.getFigura());
            System.out.println("El área del " + figura.getFigura() + " es de : " + figura.getArea());
            System.out.println("------------------------------------------------------------");
        }
    }
}
