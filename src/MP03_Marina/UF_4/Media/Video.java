package MP03_Marina.UF_4.Media;

public class Video extends Media{

    //Atributos:
    private String director;
    private String idioma;

    //Funciones Constructoras:
    public Video(){}
    public Video(String director, String idioma){
        this.director = director;
        this.idioma = idioma;
    }

    //Getters:
    public String getDirector() {
        return director;
    }
    public String getIdioma() {
        return idioma;
    }

    //Setters:
    public void setDirector(String director) {
        this.director = director;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
