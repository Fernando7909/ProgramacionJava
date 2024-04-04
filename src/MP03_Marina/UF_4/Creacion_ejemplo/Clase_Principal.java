package MP03_Marina.UF_4.Creacion_ejemplo;

public class Clase_Principal {

    public static void main(String[] args){

        //Funciones constructoras (para crear objetos)
        rectangulo r0 = new rectangulo();
        rectangulo r1 = new rectangulo("azul");
        rectangulo r2 = new rectangulo(5, 3, "verde");
        rectangulo r3 = new rectangulo(6, 4, "rosa");

        r3.setcolor("naranja");
        System.out.println(r3.getcolor());

        Circulo c0 = new Circulo();
        Circulo c1 = new Circulo(2.5, "azul");

        triangulo t0 = new triangulo();
        triangulo t1 = new triangulo(4, 4, 3, "verde");

        Cuadrado cu1 = new Cuadrado(3, "rojo");
    }
}
