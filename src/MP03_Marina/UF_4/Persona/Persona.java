package MP03_Marina.UF_4.Persona;

public class Persona {

    //Fitxer Persona.java
    private String dni;
    private String nom;
    private short edat;

    public Persona() {}

    public Persona(String sDniPersona, String sNomPersona, int nEdatPersona) {
        dni = sDniPersona;
        nom = sNomPersona;
        if (nEdatPersona >= 0 && nEdatPersona <= Short.MAX_VALUE)
            edat = (short) nEdatPersona;
    }

    public Persona(String sDni, String sNom) {
        dni = sDni;
        nom = sNom;
    }

    // Retorna: 0 si s’ha pogut canviar el dni
    // 1 si el nou dni no és correcte − No s’efectua el canvi
    public int setDni(String nouDni) {
        // Aquí hi podria haver una rutina de verificació del dni
        // i actuar en conseqüència. Com que no la incorporem, retornem sempre 0
        dni = nouDni;
        return 0;
    }

    public void setNom(String nouNom) {
        nom = nouNom;
    }

    // Retorna: 0 si s’ha pogut canviar l’edat
    // 1 : Error per passar una edat negativa
    // 2 : Error per passar una edat "enorme"
    public int setEdat(int novaEdat) {
        if (novaEdat < 0) {
            return 1;
        }
        if (novaEdat > Short.MAX_VALUE){
            return 2;
        }
        edat = (short) novaEdat;
        return 0;
    }

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public short getEdat() {
        return edat;
    }

    public void visualitzar() {
        System.out.println("Dni...........:" + dni);
        System.out.println("Nom...........:" + nom);
        System.out.println("Edat..........:" + edat);
    }

}