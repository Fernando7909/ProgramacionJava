package MP03_Marina.UF_4.Media;

public class Ogg extends Musica{

    //Atributos:
    private int version;

    //Funcion Constructora:
    public Ogg(){}
    public Ogg(int version){
        this.version = version;
    }

    //Getters:
    public int getVersion() {
        return version;
    }

    //Setters:
    public void setVersion(int version) {
        this.version = version;
    }
}
