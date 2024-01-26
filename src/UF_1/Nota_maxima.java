package UF_1;

import java.sql.SQLOutput;

public class Nota_maxima {
    public static void main(String[] args){

        float[] array_float = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f};
        float max = array_float[0];

        for (int i = 1; i < array_float.length; i++){
            if (max < array_float[i]){
                max = array_float[i];
            }
        }
        System.out.println("La nota maxima del array es: " + max);
    }
}
