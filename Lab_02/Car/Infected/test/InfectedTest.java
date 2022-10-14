import org.junit.Assert;
import org.junit.Test;

public class InfectedTest {

    @Test
    public void testAddInfected() {
        Infected malattia = new Infected("Covid19");
        malattia.addInfected(100);
        Assert.assertEquals(100, malattia.getNumberOfInfected());
    }

    @Test
    public void testUpdateInfectedByRt() {
        Infected malattia = new Infected("Covid19", 10000);
        malattia.updateInfectedByRt(2.5);
        int testNumber = (int) (2.5 * 1000);
        Assert.assertEquals(testNumber, malattia.getNumberOfInfected());
    }
}