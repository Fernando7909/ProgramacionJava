package MP03_Marina.UF_2.Estudiante_curso;

import java.util.Scanner;
public class Estudiante {

    Scanner lector = new Scanner(System.in);
    String nombre = " ";
    int edad = 0;

    public String mostrarInformacionNombre(){

        boolean name = false;
        System.out.println("Introduce tu nombre: ");
        while (!name){
            if (lector.hasNextLine()){
                nombre = lector.nextLine();
                name = true;
            }
            else {
                System.out.println("ERROR! Introduce un nombre por teclado.");
                lector.next();
            }
        }
        System.out.println("El nombre del estudiante es: " + nombre);
        return nombre;

    }
    public int mostrarInformacionEdad(){

        boolean age = false;
        System.out.println("Introduce tu edad: ");
        while (!age){
            if (lector.hasNextInt()){
                edad = lector.nextInt();
                age = true;
            }
            else {
                System.out.println("ERROR! Introduce tu edad");
                lector.next();
            }
        }
        System.out.println("La edad del estudiante es: " + edad);
        return edad;
    }
    public void esMajorEdad(int edad, String nombre){

        boolean mayorEdad = false;
        if (edad >= 18) {
            System.out.println("El estudiante de nombre " + nombre + " es mayor de edad.");
            mayorEdad = true;
        }
        else {
            System.out.println("El estudiante NO es mayor de edad.");
        }
    }
    public void saludar(String nombre) {

        System.out.println("Bienvenido a clase " + nombre);
    }
}
