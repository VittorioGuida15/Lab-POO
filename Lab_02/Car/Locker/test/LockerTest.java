import org.junit.Assert;
import org.junit.Test;

public class LockerTest {

    @Test
    public void testErrUnlock() {
        Locker locker = new Locker();
        locker.newComb("1234");
        locker.lock();
        locker.unlock("6574");
        Assert.assertEquals(false, locker.isOpen());

    }

    @Test
     public void testUnlock() {
        Locker locker = new Locker();
        locker.newComb("1234");
        locker.lock();
        locker.unlock("1234");
        Assert.assertEquals(true, locker.isOpen());
    }

    @Test
    public void testLock() {
        Locker locker = new Locker();
        locker.newComb("1234");
        locker.lock();
        locker.unlock("1234");
        locker.lock();
        Assert.assertEquals(false, locker.isOpen());
    }
}