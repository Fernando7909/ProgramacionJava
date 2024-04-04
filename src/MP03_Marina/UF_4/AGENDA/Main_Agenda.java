package MP03_Marina.UF_4.AGENDA;
public class Main_Agenda {
    public static void main(String[] args){

        //Funciones Constructoras de objetos
        Agenda a1 = new Agenda(2024);
        Pagina p1 = new Pagina(27, 2);
        Cita c1 = new Cita(18, 00, "clase java", "Programacion");

        //Agenda:
        a1.setAño(2025);
        System.out.println(a1.getAño());

        //Pagina:
        p1.setDia(28);
        System.out.println(p1.getDia());
        p1.setMes(3);
        System.out.println(p1.getMes());

        //Cita:
        c1.setHora(19);
        System.out.println(c1.getHora());
        c1.setMinutos(45);
        System.out.println(c1.getMinutos());
        c1.setTitulo("clase base de datos");
        System.out.println(c1.getTitulo());
        c1.setTexto("MySQL");
        System.out.println(c1.getTexto());
    }
}
