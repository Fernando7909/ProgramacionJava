package MP03_Marina.UF_4.AGENDA;

public class Agenda {

    //Atributos
    private int año;

    //Funcion Constructora
    public Agenda(int añoAgenda) {
        this.año = añoAgenda;
    }

    //Getters:
    public int getAño() {
        return año;
    }

    //Setters:
    public void setAño(int añoAgenda) {
        this.año = añoAgenda;
    }

    //Funcion UML
    public void avanzarPagina() {}
    public void retrocederPagina(){}
    public Pagina leerPagina(){
        //Pagina nuevaPagina = new Pagina(15, 3);
        return new Pagina(15, 3);
    }
}
