public class SavingAccount {

    private final int accountNumber;
    private static int totalNumberOfAccounts = 0;
    private double balance;
    private double interestRate;

    /**
     * A saving account has a balance that can be changed by deposits and withdrawals.
     */
    public SavingAccount(double initialRate){
        totalNumberOfAccounts++;
        accountNumber = totalNumberOfAccounts;
        balance = 0;
        interestRate = initialRate;
    }

    public SavingAccount(double initialBalance, double initialRate) {
        totalNumberOfAccounts++;
        accountNumber = totalNumberOfAccounts;
        balance = initialBalance;
        interestRate = initialRate;
    }

    /**
     * Deposit money to the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    /**
     * Aggiunge interessi trimestrali al conto
     *
     */
    public void addInterest (){
        double interessiAnnui = (balance * interestRate) / 100;
        double interessiTrimestrali = interessiAnnui / 4;
        balance += interessiTrimestrali;
    }

    /**
     * Setta il tasso di interesse
     * @param interestRate
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Gets the number of the saving account.
     *
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Gets the current balance of the saving account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Restituisce il tasso di interesse corrente dell'accaunt
     *
     * @return il tasso di interesse corrente
     */
    public double getInterestRate(){
        return interestRate;
    }
}