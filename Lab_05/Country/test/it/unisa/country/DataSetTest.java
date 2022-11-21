package it.unisa.country;

import org.junit.Assert;
import org.junit.Test;

public class DataSetTest {
    @Test
    public void testMinimum() {
        Country c1 = new Country("Italia", 2000);
        Country c2 = new Country("Francia", 3000);
        Country c3 = new Country("Inghilterra", 2599);
        DataSet dataSet = new DataSet();
        dataSet.add(c1);
        dataSet.add(c2);
        dataSet.add(c3);
        Assert.assertEquals(2000, dataSet.getMinimum().getSurfaceArea(), 0);
    }

    @Test
    public void testMaximum() {
        Country c1 = new Country("Italia", 2000);
        Country c2 = new Country("Francia", 3000);
        Country c3 = new Country("Inghilterra", 2599);
        DataSet dataSet = new DataSet();
        dataSet.add(c1);
        dataSet.add(c2);
        dataSet.add(c3);
        Assert.assertEquals(3000, dataSet.getMaximum().getSurfaceArea(), 0);
    }
}