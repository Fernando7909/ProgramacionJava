package MP03_Marina.UF_4.AGENDA;
import java.util.List;
import java.util.ArrayList;
public class Pagina {

    //Atributos
    private int dia;
    private int mes;

    //Funcion Constructora
    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }
    //Getters:
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }

    //Setters:
    public void setDia(int diaPagina){
        this.dia = diaPagina;
    }
    public void setMes(int mesPagina){
        this.mes = mesPagina;
    }

    //Funciones UML
    public void añadirCita(Cita c){}
    public void borrarCita(Cita c){}
    public Cita buscarCita(String titulo){
        return new Cita(15, 30, "Cita1", "Hola");
    }
    public List<Cita> listaCitas(){
        List<Cita> nuevaLista = new ArrayList<>();
        return nuevaLista;
    }
}