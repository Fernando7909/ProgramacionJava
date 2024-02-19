package MP03_Marina.Examen;

import java.util.Scanner;
public class Examen_arrays3 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        boolean medida = false;
        int contador = 0;
        int suma = 0;
        double promedio = 0;
        int[] array_int = new int[15];

        System.out.println("Introduce las edades de los individuos: ");
        while (!medida){
            for (int i = 0; i < array_int.length; i++){
                if (lector.hasNextInt()){
                    array_int[i] = lector.nextInt();
                    if (array_int[i] >= 18){
                        System.out.println("Edad de la persona" + (i + 1) + ":" + array_int[i]);
                        medida = true;
                        contador++;
                    }
                    else if (array_int[i] == -1) {
                        System.out.println("Edad de la persona" + (i + 1) + ":" + array_int[i]);
                        lector.close();
                    }
                    else if (array_int[i] <= 0) {
                        System.out.println("ERROR! Introduce una edad valida.");
                        lector.next();
                    }
                    else {
                        System.out.println("Edad de la persona" + (i + 1) + ":" + array_int[i]);
                        contador++;
                    }
                }
                else {
                    System.out.println("ERROR! Has introducido un valor equivocado. Introduce una edad valida.");
                    i--;
                    lector.next();
                }
            }
        }
        for (int i = 0; i < array_int.length - contador; i++){
            if (array_int[i] >= 18){
                suma = suma + array_int[i];
            }
        }
        promedio = suma / array_int.length - contador;
        System.out.println("Edad promedio de personas de 18 años o más: " + promedio);
    }
}
