package MP03_Marina.UF_4.Media;

public class Musica extends Media {

    //Atributos:
    private String artista;
    private String estilo;

    //Funciones Constructoras:
    public Musica(){}
    public Musica(String artista, String estilo){
        this.artista = artista;
        this.estilo = estilo;
    }

    //Getters:
    public String getArtista() {
        return artista;
    }
    public String getEstilo() {
        return estilo;
    }

    //Setters:
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
