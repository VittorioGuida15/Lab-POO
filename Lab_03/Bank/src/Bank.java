import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(double initialBalance, String customerName) {
        BankAccount account = new BankAccount(initialBalance, customerName);
        accounts.add(account);
    }

    public BankAccount find(int accountNumber) {
        for (BankAccount ba : this.accounts) {
            if (ba.getAccountNumber() == accountNumber)
                return ba;
        }
        return null;
    }

    public void deposit(int accountNumber, double amount) {
        BankAccount account = this.find(accountNumber);
        if(account != null)
            account.deposit(amount);
    }

    public void withdraw(int accountNumber, double amount) {
        BankAccount account = this.find(accountNumber);
        if(account != null)
            if (account.getBalance() > amount)
                account.withdraw(amount);
    }

    public double getBalance(int accountNumber) {
        BankAccount account = this.find(accountNumber);
        double balance;
        if(account != null) {
            balance = account.getBalance();
            return balance;
        }
        balance = -1;
        return balance;
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
        BankAccount account1 = find(fromAccountNumber);
        BankAccount account2 = find(toAccountNumber);
        if(account1 != null && account2 != null){
            if(account1.getBalance() > amount){
                account1.withdraw(amount);
                account2.deposit(amount);
            }
        }
    }
}