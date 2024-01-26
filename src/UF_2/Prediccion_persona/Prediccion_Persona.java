package UF_2.Prediccion_persona;

import java.util.Scanner;
public class Prediccion_Persona {
    Scanner lector = new Scanner(System.in);

    public static void main(String[] args){
        Prediccion_Persona programa = new Prediccion_Persona();
        programa.inicio();
    }
    public void inicio(){
        leerLista();
        String MesNacimiento = escogerMes();
        String nombre = escribirNombre();
        int edad = escribirEdad();
    }
    public void leerLista(){
        System.out.print("Escribe el mes en el que naciste: ");
        System.out.print("\n");
        System.out.print("Enero\tFebrero\tMarzo\n");
        System.out.print("Abril\tMayo\tJunio\n");
        System.out.print("Julio\tAgosto\tSeptiembre\n");
        System.out.print("Octubre\tNoviembre\tDiciembre");
        System.out.print("\n\n");
    }
    public String escogerMes(){
        String MesNacimiento = lector.nextLine();
        return MesNacimiento;
    }
    public String escribirNombre(){
        System.out.print("\n");
        System.out.print("¿Como te llamas?\n");
        String nombre = lector.nextLine();
        return nombre;
    }
    public Double escribirEdad(){
        System.out.print("\n");
        System.out.print("Para acabar, ¿cuantos años tienes?\n");
        int edad = lector.nextInt();
        return edad;
    }
}
