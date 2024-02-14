package MP03_Marina.UF_2.Ej_Calcular_Areas;

import java.util.Scanner;

public class calcularAreas {
    Scanner lector = new Scanner(System.in);
    double Area;
    Calculo_poligonos calcul_poli = new Calculo_poligonos();

    public double calcularAreas(String Figura) {   //Parametro de entrada Figura, ya que lo vamos a utilizar

        double resultado = 0;

        if (Figura.equals("triangulo")) {
            resultado = calcul_poli.triangulo();
        }
        else if (Figura.equals("cuadrado")) {
            resultado = calcul_poli.cuadrado();
        }
        else if (Figura.equals("rectangulo")) {
            resultado = calcul_poli.rectangulo();
        }
        else if (Figura.equals("trapecio")) {
            resultado = calcul_poli.trapecio();
        }
        else if (Figura.equals("rombo")) {
            resultado = calcul_poli.rombo();
        }
        else if (Figura.equals("paralelogramo")) {
            resultado = calcul_poli.paralelogramo();
        }
        else if (Figura.equals("circulo")) {
            resultado = calcul_poli.circulo();
        }
        return resultado;
    }
}



