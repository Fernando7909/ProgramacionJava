package MP03_Marina.UF_2.Estudiante_curso;

import java.util.Scanner;
public class Programa_principal {
    Scanner lector = new Scanner(System.in);
    boolean fin = false;
    public static void main(String[] args) {
        Programa_principal programa = new Programa_principal();
        programa.inicio();
    }
    public void inicio() {
        while (!fin){
            mostrarMenu();
            selectOpcion();
            calcular();
        }
    }
    public void mostrarMenu(){
        System.out.println("Bienvenido a PRAT EDUCACIÓ!");
        System.out.println("Selecciona una de las 2 opciones: ");
        System.out.println("[CAL] Calcula los creditos en funcion de tu curso");
        System.out.println("[FIN] Sal del programa de calculo");
        System.out.print("Escribe tu opción: ");
    }
    public void selectOpcion() {

        String opcion;
        boolean select = false;
        while (!select) {
            if (lector.hasNextLine()) {
                opcion = lector.nextLine();
                if (opcion.toLowerCase().equalsIgnoreCase("CAL")) {
                    calcular();
                    select = true;
                } else if (opcion.toLowerCase().equalsIgnoreCase("FIN")) {
                    finalizarEjecucion();
                    //select = true;
                } else {
                    System.out.println("ERROR! Selecciona una de las 2 opciones.");
                }
            }
        }
    }
    public void calcular() {
        Estudiante inst1 = new Estudiante();
        Curso inst2 = new Curso();

        String nombre = inst1.mostrarInformacionNombre();
        int edad = inst1.mostrarInformacionEdad();
        inst1.esMajorEdad(edad, nombre);
        inst1.saludar(nombre);
        inst2.mostrarInformacionCurso();
        int creditos = inst2.mostrarInformacionCreditos();
        inst2.obtenerHoras(creditos);
    }
    public void finalizarEjecucion() {
        System.out.println("El programa termina aquí.");
        fin = true;
    }
}

