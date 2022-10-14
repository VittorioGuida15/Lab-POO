public class VendingMachine {
    private int numberOfCans;
    private int numberOfTokens;

    public VendingMachine() {
    }

    public VendingMachine(int initialNumberOfCans) {
        numberOfCans = initialNumberOfCans;
        numberOfTokens = 0;
    }

    public void addCans(int numberOfNewCans) {
        numberOfCans += numberOfNewCans;
    }

    public void takeCan() {
        if(numberOfCans != 0) {
            numberOfTokens++;
            numberOfCans--;
        }
        else
            System.out.println("Il distributore è vuoto!");
    }

    public void takeTokens() {
        numberOfTokens = 0;
    }

    public int getNumberOfCans() {
        return numberOfCans;
    }

    public int getNumberOfTokens() {
        return numberOfTokens;
    }
}