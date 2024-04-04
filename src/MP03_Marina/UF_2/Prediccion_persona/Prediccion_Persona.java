package MP03_Marina.UF_2.Prediccion_persona;

import java.util.Scanner;
public class Prediccion_Persona {
    Scanner lector = new Scanner(System.in);
    String equipFutbol = "";
    String lenguajeProgramacion = "";
    int numeroSuerte = 0;
    int edad = 0;
    String nombre = "";
    String mesNacimiento = "";

    public static void main(String[] args){
        Prediccion_Persona programa = new Prediccion_Persona();
        programa.inicio();
    }
    public void inicio(){
        leerLista();
        mesNacimiento = escogerMes();
        nombre = escribirNombre();
        edad = escribirEdad();
        futbolProgramacion(edad);
        mensajeFinal();
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
        mesNacimiento = lector.nextLine();
        return mesNacimiento;
    }
    public String escribirNombre(){
        System.out.print("\n");
        System.out.print("¿Como te llamas?\n");
        nombre = lector.nextLine();
        return nombre;
    }
    public int escribirEdad(){
        System.out.print("\n");
        System.out.print("Para acabar, ¿cuantos años tienes?\n");
        edad = lector.nextInt();
        System.out.print("\n\n");
        return edad;
    }
    public void futbolProgramacion(int edad) {
        if (mesNacimiento.equals("Enero") || mesNacimiento.equals("enero")) {
            numeroSuerte = edad * 3 / 2;
            equipFutbol = "Bayern de Munich";
            lenguajeProgramacion = "C++";
        } else if (mesNacimiento.equals("Febrero") || mesNacimiento.equals("febrero")) {
            numeroSuerte = edad - 4;
            equipFutbol = "Atlético de Madrid";
            lenguajeProgramacion = "Python";
        } else if (mesNacimiento.equals("Marzo") || mesNacimiento.equals("marzo")) {
            numeroSuerte = edad / 2;
            equipFutbol = "Chelsea";
            lenguajeProgramacion = "JavaScript";
        } else if (mesNacimiento.equals("Abril") || mesNacimiento.equals("abril")) {
            numeroSuerte = edad % 4;
            equipFutbol = "Manchester city";
            lenguajeProgramacion = "Node.js";
        } else if (mesNacimiento.equals("Mayo") || mesNacimiento.equals("mayo")) {
            numeroSuerte = edad * 3 / 6;
            equipFutbol = "Liverpool";
            lenguajeProgramacion = "React";
        } else if (mesNacimiento.equals("Junio") || mesNacimiento.equals("junio")) {
            numeroSuerte = edad + edad;
            equipFutbol = "Real Madrid";
            lenguajeProgramacion = "C#";
        } else if (mesNacimiento.equals("Julio") || mesNacimiento.equals("julio")) {
            numeroSuerte = edad * edad / 5;
            equipFutbol = "BVB";
            lenguajeProgramacion = "Swift";
        } else if (mesNacimiento.equals("Agosto") || mesNacimiento.equals("agosto")) {
            numeroSuerte = edad * 1 / 2 * edad;
            equipFutbol = "FCB";
            lenguajeProgramacion = "Java";
        } else if (mesNacimiento.equals("Septiembre") || mesNacimiento.equals("septiembre")) {
            numeroSuerte = edad / edad;
            equipFutbol = "Juve";
            lenguajeProgramacion = "PHP";
        } else if (mesNacimiento.equals("Octubre") || mesNacimiento.equals("octubre")) {
            numeroSuerte = edad * 4 / 3;
            equipFutbol = "PSG";
            lenguajeProgramacion = "R";
        } else if (mesNacimiento.equals("Noviembre") || mesNacimiento.equals("noviembre")) {
            numeroSuerte = edad % 2 + 23;
            equipFutbol = "Sevilla CF";
            lenguajeProgramacion = "Go";
        } else if (mesNacimiento.equals("Diciembre") || mesNacimiento.equals("diciembre")) {
            numeroSuerte = (edad + edad) / 2;
            equipFutbol = "Manchester United";
            lenguajeProgramacion = "Ruby";
        } else {
            numeroSuerte = 0;
            equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
            lenguajeProgramacion = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
            System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
        }
    }
    public void mensajeFinal(){
        System.out.print("------------------------------------------------\n");

        System.out.print("Un plaer conèixer-te " + nombre + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
        System.out.print("\n\n");

        System.out.print(">>> El teu número de la sort és el " + numeroSuerte + "!");
        System.out.print("\n\n");

        System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
        System.out.print("\n\n");

        System.out.print(">>> El teu llenguatge de programació més estimat serà " + lenguajeProgramacion + "!");
        System.out.print("\n\n");

        System.out.print("Torna quan vulguis!\n");
        System.out.print("------------------------------------------------\n\n\n");
    }
}
