package it.unisa.school;

public class Professor extends Person {

    private double stipendo;
    private String specializzazione;
    public Professor(String name, String lastName, int birthYears, String specializzazione, double stipendo){
        super(name, lastName, birthYears);
        this.stipendo = stipendo;
        this.specializzazione = specializzazione;
    }

    /* TODO */

    /* TODO */

    @Override
    public String toString() {
        return super.toString() +
                ", Argomento='" + specializzazione + '\'' +
                ", Stipendio=" + stipendo;
    }
}
