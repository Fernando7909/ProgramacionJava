package MP03_Marina.UF_2.Estudiante_curso;

import java.util.Scanner;
public class Curso {

    Scanner lector = new Scanner(System.in);
    int creditos = 0;

    public void mostrarInformacionCurso(){

        String nombre_curso = " ";
        boolean course = false;

        System.out.println("Introduce el nombre de tu curso o Ciclo Formativo: ");
        while (!course){
            if (lector.hasNextLine()){
                nombre_curso = lector.nextLine();
                course = true;
            }
            else {
                System.out.println("ERROR! Has introducido un valor equivocado. Introduce el nombre de tu curso.");
                lector.next();
            }
        }
        System.out.println("El nombre del curso es: " + nombre_curso);
    }
    public int mostrarInformacionCreditos(){

        boolean credits = false;
        System.out.println("Introduce la cantidad de Creditos que necesitas para el curso: ");
        while (!credits){
            if (lector.hasNextInt()){
                creditos = lector.nextInt();
                if (creditos > 0){
                    credits = true;
                }
                else {
                    System.out.println("ERROR! Introduce la cantidad de creditos correcta.");
                }
            }
            else {
                System.out.println("ERROR! Introduce los creditos que necesitas para el curso.");
                lector.next();
            }
        }
        System.out.println("Los creditos para este curso son: " + creditos);
        return creditos;
    }
    public void obtenerHoras(int creditos){

        int horas = 0;
        horas = creditos * 15;
        System.out.println("La cantidad de horas del curso basadas en los creditos es: " + horas);
    }
}
