package it.unisa.school;

public class Student extends Person {

    private int assenze;

    public Student(String name, String lastName, int birthYear, int assenze){
        super(name, lastName, birthYear);
        this.assenze = assenze;
    }

    public void addAssenze() {
        this.assenze++;
    }

    public void subAssenze() {
        this.assenze--;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Numero di assenze=" + assenze;
    }
}
