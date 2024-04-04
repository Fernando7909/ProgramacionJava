package MP03_Marina.UF_4.Media;

public class MP3 extends Musica{

    //Atributos:
     private int mode;

     //Funcion Constructora:
    public MP3(){}
    public MP3(int mode){
        this.mode = mode;
    }

    //Getters:
    public int getMode() {
        return mode;
    }

    //Setters:
    public void setMode(int mode) {
        this.mode = mode;
    }
}
