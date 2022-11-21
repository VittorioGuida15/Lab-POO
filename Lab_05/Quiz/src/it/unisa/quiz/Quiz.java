package it.unisa.quiz;

public class Quiz implements Measurable {

    private double vote;
    private  String subject;

    public Quiz(double vote){
        this.vote = vote;
    }

    @Override
    public double getMeasure() {
        return vote;
    }
}
