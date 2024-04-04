package MP03_Marina.UF_4.Herencia;

public class Animal {

    //Atributos
    private static int id = 0;

    //Funcion Constructora
    public Animal(){
        this.id = ++id;
//        ++id;
    }

    //Getters
    public int getId() {
        return id;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    //Funcion
    public void sound() {
        System.out.println("By default it is mute");
    }
}
