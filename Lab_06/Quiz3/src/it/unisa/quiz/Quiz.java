package it.unisa.quiz;

public class Quiz implements Measurable {

    private final double score;

    public Quiz(double score) {
        this.score = score;
    }

    @Override
    public double getMeasure() {
        return score;
    }

    @Override
    public int compareTo(Measurable measurable) {
        if(measurable instanceof Quiz) {
            Quiz quiz = (Quiz) measurable;
            return Double.compare(this.score, quiz.score);
        }
        else return -1;

    }
}
