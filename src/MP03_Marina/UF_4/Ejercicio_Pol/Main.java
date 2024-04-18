package MP03_Marina.UF_4.Ejercicio_Pol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ejecutar = false;
        String nombre = " ";
        String direccion = " ";
        double salario = 0;

        // He quitado el while (true)
        while (!ejecutar) {
            System.out.println("Quin tipus d'empleat ets? (Manager, Developer, Programmer, Exit)");
            String puestoTrabajo = scanner.nextLine().toLowerCase();

            if (puestoTrabajo.equals("exit")) {
                break;
            }

            // He añadido una gestion de errores para cada pregunta

            System.out.println("Com et dius?");
            if (scanner.hasNextLine()){
                nombre = scanner.nextLine();
            }
            else {
                System.out.println("ERROR! Escribe un nombre.");
            }

            System.out.println("Quina és la teva direcció?");
            if (scanner.hasNextLine()){
                direccion = scanner.nextLine();
            }
            else {
                System.out.println("ERROR! Escribe un nombre.");
            }

            System.out.println("Quin és el teu rang salarial?");
            if (scanner.hasNextDouble()){
                salario = scanner.nextDouble();
            }
            else {
                System.out.println("ERROR! Escribe tu rango salarial.");
                scanner.next();
            }
            scanner.nextLine(); // Limpiar el búfer

            Employee nouEmpleat = crearEmpleat(puestoTrabajo, nombre, direccion, salario, scanner);
            if (nouEmpleat != null) {
                imprimirDades(nouEmpleat);
            } else {
                System.out.println("Rol d'empleat no vàlid.");
            }
        }
        scanner.close();
    }

    public static Employee crearEmpleat(String puestoTrabajo, String nombre, String direccion, double salario, Scanner scanner) {
        switch (puestoTrabajo) {
            case "manager":
                System.out.println("Quants treballadors gestiona?");
                int numTrabajadores = scanner.nextInt();
                scanner.nextLine();
                return new Manager(nombre, direccion, salario, puestoTrabajo, numTrabajadores);
            case "developer":
                System.out.println("Quin llenguatge de programació utilitza?");
                String lenguajeProgramacion = scanner.nextLine().toLowerCase();
                return new Developer(nombre, direccion, salario, puestoTrabajo, lenguajeProgramacion);
            case "programmer":
                return new Programmer(nombre, direccion, salario, puestoTrabajo);
            default:
                return null;
        }
    }

    public static void imprimirDades(Employee empleado) {
        System.out.println("Dades de l'empleat:");
        System.out.println("Nom: " + empleado.getNombre());
        System.out.println("Direcció: " + empleado.getDireccion());
        System.out.println("Salari: " + empleado.getSalario());
        System.out.println("Posició: " + empleado.getPuestoTrabajo());

        if (empleado instanceof Manager) {
            System.out.println("Nombre de treballadors: " + ((Manager) empleado).getNumTrabajadores());
            ((Manager) empleado).gestionProyecto();
        }
        else if (empleado instanceof Developer) {
            System.out.println("Llenguatge de programació: " + ((Developer) empleado).getLenguajeProgramacion());
            ((Developer) empleado).escribirCodigo();
        }
        else if (empleado instanceof Programmer) {
            Programmer.debug();
        }

        System.out.println("Bonus: " + empleado.calcularBonus());
        System.out.println("Informe: " + empleado.generarReport());
        System.out.println("--------------------------------------");
    }
}
