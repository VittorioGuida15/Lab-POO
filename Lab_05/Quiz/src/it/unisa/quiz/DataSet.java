package it.unisa.quiz;

public class DataSet {

    private double sum;
    private Measurable minimum;
    private Measurable maximum;
    private int count;

    public DataSet() {
        this.sum = 0;
        this.count = 0;
        this.maximum = null;
        this.minimum = null;
    }

    public double getAverage() {
        if(count == 0) return 0;
        else return  sum/count;
    }

    public Measurable getMaximum() {
        return maximum;
    }

    public Measurable getMinimum() {
        return  minimum;
    }

    public void add(Measurable x) {
        sum += x.getMeasure();
        if(count == 0 || x.getMeasure() < minimum.getMeasure())
            minimum = x;
        if(count == 0 || x.getMeasure() > maximum.getMeasure())
            maximum = x;
        count++;
    }
}