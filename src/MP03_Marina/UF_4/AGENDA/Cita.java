package MP03_Marina.UF_4.AGENDA;

public class Cita {

    //Atributos
    private int hora;
    private int minutos;
    private String titulo;
    private String texto;

    //Funcion Constructora
    public Cita(int horaCita, int minutosCita, String tituloCita, String textoCita) {
        this.hora = horaCita;
        this.minutos = minutosCita;
        this.titulo = tituloCita;
        this.texto = textoCita;
    }

    //Getters:
    public int getHora(){
        return hora;
    }
    public int getMinutos(){
        return minutos;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getTexto(){
        return texto;
    }

    //Setters:
    public void setHora(int horaCita){
        this.hora = horaCita;
    }
    public void setMinutos(int minutosCita){
        this.minutos = minutosCita;
    }
    public void setTitulo(String tituloCita){
        this.titulo = tituloCita;
    }
    public void setTexto(String textoCita){
        this.texto = textoCita;
    }

    //Funcion UML
    public void modificarTexto(String texto) {}
}
