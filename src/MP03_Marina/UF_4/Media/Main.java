package MP03_Marina.UF_4.Media;

public class Main {
    public static void main(String[] args){

        //Funciones Constructoras:
        Media Me = new Media();
        Media Me1 = new Media("Fernando", 120);

        Me1.setNombre("James");
        System.out.println(Me1.getNombre());
        System.out.println(Me1.getDuracion());

        Musica Mu = new Musica();
        Musica Mu1 = new Musica("Metallica", "Heavy_Metal");
        System.out.println(Mu1.getArtista());
        System.out.println(Mu1.getEstilo());

        Video Vi = new Video();
        Video Vi1 = new Video("Daniel", "English");
        System.out.println(Vi1.getDirector());
        System.out.println(Vi1.getIdioma());

        MP3 M = new MP3();
        MP3 M1 = new MP3(50);
        System.out.println(M1.getMode());

        Ogg O = new Ogg();
        Ogg O1 = new Ogg(23);
        O1.setVersion(93);
        System.out.println(O1.getVersion());
    }
}
