package MP03_Marina.UF_4.Proyecto_Figura;

import java.util.Scanner;
public class Circulo extends Figura{

    //Atributos
    private int radio;

    //Funciones Constructoras:
    public Circulo(){}
    public Circulo(String figura, int id, int radio) {
        super(figura);
        this.radio = radio;
    }

    //Getters:
    public double getRadio(){
        return radio;
    }

    //Setters:
    public void setRadio(int radio){
        this.radio = radio;
    }

    //Otras Funciones:
    public void Circulo(int r){}
    @Override
    public double calcularArea(){
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce la medida del radio del Circulo: ");
        setRadio(radio = lector.nextInt());

        return Math.PI * Math.pow(radio, 2);
    }
}
