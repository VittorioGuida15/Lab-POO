import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void testAddGas() {
        Car ferrari = new Car(5.0);
        ferrari.addGas(15.0);
        Assert.assertEquals(15.0, ferrari.getGas(),0);
    }

    @Test
    public void testDrive() {
        Car ferrari = new Car(15.0, 5.0);
        ferrari.drive(10);
        Assert.assertEquals(13.0, ferrari.getGas(), 0);
    }
}