package MP03_Marina.UF_4.Empresa;

public class Encargo {

    //Atributos
    private int dia;
    private int mes;
    private int hora;
    private int minutos;

    //Funcion Constructora
    public Encargo(int diaEncargo, int mesEncargo, int horaEncargo, int minutosEncargo) {
        this.dia = diaEncargo;
        this.mes = mesEncargo;
        this.hora = horaEncargo;
        this.minutos = minutosEncargo;
    }

    //Getters:
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getHora(){
        return hora;
    }
    public int getMinutos(){
        return minutos;
    }

    //Setters:
    public void setDia(int newDay){
        this.dia = newDay;
    }
    public void setMes(int newMonth){
        this.mes = newMonth;
    }
    public void setHora(int newHour){
        this.hora = newHour;
    }
    public void setMinutos(int newMinutes){
        this.minutos = newMinutes;
    }

    //Funciones UML
    public void añadirProducto(Peticion p){}
    public void eliminarProducto(Peticion p){}
}
