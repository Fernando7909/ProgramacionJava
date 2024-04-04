package MP03_Marina.UF_4.Herencia_Simple;

public class Estudiante extends Persona{

    //Atributos:
    private String curso;
    private String asignaturas;
    private String escuela;
    private String notas;


   //Funcion Constructora
    public Estudiante(){}
    public Estudiante(int id, int edad, String nombre, String apellido, String direccion, String curso) {
        super(id, edad, nombre, apellido, direccion);
        this.curso = curso;
    }

//    public Estudiante(String curso, String asignaturas, String escuela, String notas) {
//        this.curso = curso;
//        this.asignaturas = asignaturas;
//        this.escuela = escuela;
//        this.notas = notas;
//    }

    //Getters:
    public String getCurso() {
        return curso;
    }
    public String getAsignaturas() {
        return asignaturas;
    }
    public String getEscuela() {
        return escuela;
    }
    public String getNotas() {
        return notas;
    }

    //Setters:
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setAsignaturas(String asignaturas) {
        this.asignaturas = asignaturas;
    }
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    public void setNotas(String notas) {
        this.notas = notas;
    }
}
