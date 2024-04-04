package MP03_Marina.UF_4.Herencia;

public class Cat extends Animal{

    public void miau(){
        System.out.println("El gato " + getId() + " hace miau");
    }
    @Override
    public void sound() {
        miau();
    }
}
