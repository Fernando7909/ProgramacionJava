package MP03_Marina.UF_2.Ej_Calcular_Areas;

public class Areas_mod {
    double Area;
    public static void main(String[] args) {
        Areas_mod programa = new Areas_mod();
        programa.inicio();
    }
// Si no pones Static, hay que hacer una instancia para acceder a cada clase
    public void inicio() {

        // Escribimos las INSTANCIAS. Una para cada clase que se ha creado en un documento aparte
        leerdatos ldatos = new leerdatos();
        calcularAreas calcular = new calcularAreas();
        Calculo_poligonos calcul_poli = new Calculo_poligonos();

        // Ponemos el nombre de la instancia a cada clase
        leerLista();
        String Figura = ldatos.leerdatos_Scanner();
        double resultado = calcular.calcularAreas(Figura);


        System.out.println("El Area de la figura " + Figura + " es " + resultado);
    }
    public void leerLista(){ 

        System.out.println("De que figura quieres calcular el area?\n");
        System.out.println("Tienes las siguientes opciones: triangulo, cuadrado, rectangulo, trapecio, rombo, paralelogramo o circulo.\n");
        System.out.println("Escribe el nombre de una figura: ");
    }
}
