package MP03_Marina.UF_4.Herencia;

public class Main {
    public static void main(String[] args){

        //Funciones Constructoras:
        Animal a = new Animal();
        a.sound();
        System.out.println(a.getId());

        Animal a1 = new Animal();
        a1.sound();

        Dog d = new Dog();
        d.sound();
        Dog d1 = new Dog();
        d1.sound();

        Cat c = new Cat();
        c.sound();
    }
}
