package MP03_Marina.UF_4.Proyecto_Figura;

import java.util.Scanner;
public class Rectangulo extends Figura {

    //Atributos:
    private int lado1;
    private int lado2;

    //Funciones Constructoras:
    public Rectangulo(){}
    public Rectangulo(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Getters:
    public int getLado1(){
        return lado1;
    }
    public int getLado2(){
        return lado2;
    }

    //Setters:
    public void setLado1(int lado1){
        this.lado1 = lado1;
    }
    public void setLado2(int lado2){
        this.lado2 = lado2;
    }

    //Otras Funciones:
    public void Rectangulo(int c1, int c2){}
    @Override
    public double calcularArea(){
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce la medida del lado1 del Rectangulo: ");
        setLado1(lado1 = lector.nextInt());
        System.out.println("Introduce la medida del lado2 del Rectangulo: ");
        setLado2(lado2 = lector.nextInt());

        return this.lado1 * this.lado2;
    }
}
