package MP03_Marina.UF_2;

import java.util.Scanner;
public class NotaEnPalabra {
    Scanner lector = new Scanner(System.in);
    boolean fin = false;
    double nota = 0;
    String notaTexto = " ";

    public static void main(String[] args){
        NotaEnPalabra programa = new NotaEnPalabra();
        programa.inicio();
    }
    public void inicio(){
        while (!fin){
            mostrarMenu();
            seleccionarOpcion();
        }
    }
    public void mostrarMenu(){
        System.out.println("Bienvenido al programa NotaEnPalabra.");
        System.out.println("Si quieres ejecutar el programa escribe [ok]");
        System.out.println("Si quieres finalizar el programa escribe [fin]");
    }
    public void seleccionarOpcion(){

        String Opcion = lector.nextLine();
        if (Opcion.toLowerCase().equalsIgnoreCase("ok")){
            nota = introducirNota();
            notaTexto = calcularNota(nota);
            imprimir(notaTexto);
        }
        else if (Opcion.toLowerCase().equalsIgnoreCase("fin")) {
            finalizarEjecucion();
        }
        else {
            System.out.println("Opcion incorrecta");
        }
    }
    public double introducirNota(){

        System.out.println("Introduce una nota: ");
        boolean medida = false;

        while (!medida){
            if (lector.hasNextDouble()){
                if (nota <= 10 && nota >= 0){
                    nota = lector.nextDouble();
                    medida = true;
                }
                else {
                    System.out.println("ERROR! No es una nota valida");
                }
            }
            else {
                System.out.println("ERROR! Has introducido un valor incorrecto.");
                lector.next();
            }
        }
        return nota;
    }
    public String calcularNota(double nota){

        if (nota >= 9 && nota <= 10 ){
            notaTexto = "Excelente";
        }
        else if (nota >= 6.5 && nota <= 8.9){
            notaTexto = "Notable";
        }
        else if (nota >= 5 && nota <= 6.49) {
            notaTexto = "Aprovado";
        }
        else if (nota >= 0 && nota <= 4.9) {
            notaTexto = "Suspenso";
        }
        else {
            notaTexto = "Nota no valida";
        }
        return notaTexto;
    }
    public void imprimir(String notaTexto){
        System.out.println("La nota final es: " + notaTexto);
    }
    public void finalizarEjecucion(){
        fin = true;
    }
}
