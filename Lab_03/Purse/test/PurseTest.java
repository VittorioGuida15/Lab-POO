import org.junit.Assert;
import org.junit.Test;

public class PurseTest {

  @Test
  public void findTest() {
    Purse purse = new Purse();
    purse.add(Purse.Dollar);
    purse.add(Purse.Dime);
    purse.add(Purse.Cent);
    Assert.assertTrue(purse.find(Purse.Dollar));
    Assert.assertFalse(purse.find(Purse.Nickel));
  }

  @Test
  public void countTest() {
    Purse purse = new Purse();
    purse.add(Purse.Dollar);
    purse.add(Purse.Dollar);
    purse.add(Purse.Cent);
    Assert.assertEquals(2, purse.count(Purse.Dollar));
    Assert.assertEquals(0, purse.count(Purse.Dime));
  }

  @Test
  public void minMaxTest() {
    Purse purse = new Purse();
    purse.add(Purse.Dollar);
    purse.add(Purse.Dime);
    purse.add(Purse.Cent);
    Assert.assertEquals(Purse.Cent, purse.getMinimum());
    Assert.assertEquals(Purse.Dollar, purse.getMaximum());
  }

  @Test
  public void getTotalTest() {
    Purse purse = new Purse();
    purse.add(Purse.Dollar);
    purse.add(Purse.Dime);
    purse.add(Purse.Cent);
    double tot = Purse.Dollar.getValue() + Purse.Dime.getValue() + Purse.Cent.getValue();
    Assert.assertEquals(tot, purse.getTotal(), 0);
  }

  @Test
  public void addRemoveTest() {
    Purse purse = new Purse();
    purse.add(Purse.Dollar);
    purse.add(Purse.Dime);
    purse.add(Purse.Cent);

    Purse aPurse = new Purse();
    aPurse.add(Purse.Dollar);
    aPurse.add(Purse.Cent);

    purse.remove(Purse.Dime);
    Assert.assertEquals(aPurse, purse);
  }

  @Test
  public void hasCoinTest() {
    Purse purse = new Purse();
    purse.add(Purse.Dollar);
    purse.add(Purse.Dime);
    purse.add(Purse.Cent);
    Assert.assertTrue(purse.hasCoin(Purse.Dollar));
    Assert.assertFalse(purse.hasCoin(Purse.Nickel));
  }

  @Test
  public void toStringTest() {
    Purse purse = new Purse();
    purse.add(Purse.Dollar);
    purse.add(Purse.Dollar);
    purse.add(Purse.Dime);
    purse.add(Purse.Cent);
    String s1 = "Purse[Dollar = 2, Quarter = 0, Dime = 1, Nickel = 0, Cent = 1]";
    Assert.assertEquals(s1, purse.toString());

  }

  @Test
  public void equalsTest() {
    Purse purse = new Purse();
    purse.add(Purse.Dollar);
    purse.add(Purse.Dime);
    purse.add(Purse.Cent);

    Purse aPurse = new Purse();
    aPurse.add(Purse.Dollar);
    aPurse.add(Purse.Dime);
    aPurse.add(Purse.Cent);

    Assert.assertTrue(purse.equals(aPurse));

    aPurse.remove(Purse.Dollar);
    Assert.assertFalse(purse.equals(aPurse));
  }
}