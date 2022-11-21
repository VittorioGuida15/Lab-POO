package it.unisa.quiz;

import org.junit.Assert;
import org.junit.Test;

public class DataSetTest {
    @Test
    public void testMinimum() {
        Quiz q1 = new Quiz(6.5);
        Quiz q2 = new Quiz(7);
        Quiz q3 = new Quiz(7.5);
        DataSet dataset = new DataSet();
        dataset.add(q1);
        dataset.add(q2);
        dataset.add(q3);
        Assert.assertEquals(6.5, dataset.getMinimum().getMeasure(), 0);
    }

    @Test
    public void testMaximum() {
        Quiz q1 = new Quiz(6.5);
        Quiz q2 = new Quiz(7);
        Quiz q3 = new Quiz(7.5);
        DataSet dataset = new DataSet();
        dataset.add(q1);
        dataset.add(q2);
        dataset.add(q3);
        Assert.assertEquals(7.5, dataset.getMaximum().getMeasure(), 0);
    }

    @Test
    public void testAverage() {
        Quiz q1 = new Quiz(6.5);
        Quiz q2 = new Quiz(7);
        Quiz q3 = new Quiz(7.5);
        DataSet dataset = new DataSet();
        dataset.add(q1);
        dataset.add(q2);
        dataset.add(q3);
        double average = (6.5 + 7 + 7.5) / 3;
        Assert.assertEquals(average, dataset.getAverage(), 0);
    }
}