import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {
    @Test
    public void testAddCans() {
        VendingMachine machine = new VendingMachine(10);
        machine.addCans(5);
        Assert.assertEquals(15, machine.getNumberOfCans());
    }

    @Test
    public void testTakeCan() {
        VendingMachine machine = new VendingMachine(10);
        machine.takeCan();
        Assert.assertEquals(9, machine.getNumberOfCans());
        Assert.assertEquals(1, machine.getNumberOfTokens());
    }

    @Test
    public void testTaketoken() {
        VendingMachine machine = new VendingMachine(10);
        machine.takeCan();
        machine.takeCan();
        machine.takeCan();
        machine.takeTokens();
        Assert.assertEquals(0, machine.getNumberOfTokens());
    }
}