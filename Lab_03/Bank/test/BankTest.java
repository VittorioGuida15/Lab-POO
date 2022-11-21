import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

    @Before
    public void setup(){
        BankAccount.totalNumberOfAccounts = 0;
    }

    @Test
    public void findAccountTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Dario");
        BankAccount newAccount = b.find(1);
        Assert.assertEquals(1, newAccount.getAccountNumber());
        Assert.assertEquals(1000, newAccount.getBalance(), 0);
        Assert.assertEquals("Dario", newAccount.getCustomerName());
    }

    @Test
    public void depositTest() {
        Bank bank = new Bank();
        bank.addAccount(1000, "Vittorio");
        bank.deposit(1, 500);
        Assert.assertEquals(1500, bank.getBalance(1), 0);
    }

    @Test
    public void withdrawTest() {
        Bank bank = new Bank();
        bank.addAccount(1000, "Vittorio");
        bank.withdraw(1, 500);
        Assert.assertEquals(500, bank.getBalance(1), 0);
    }

    @Test
    public void transferTest() {
        Bank bank = new Bank();
        bank.addAccount(1000, "Vittorio");
        bank.addAccount(1000, "Dario");
        bank.transfer(2,1, 500);
        Assert.assertEquals(500, bank.getBalance(2), 0);
        Assert.assertEquals(1500, bank.getBalance(1), 0);

    }
}