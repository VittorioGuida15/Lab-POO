import java.util.ArrayList;
import java.util.List;

public class Purse {

    final static Coin Dollar = new Coin("Dollar", 1);
    final static Coin Quarter = new Coin("Quarter", 0.25);
    final static Coin Dime = new Coin("Dime", 0.10);
    final static Coin Nickel = new Coin("Nickel", 0.05);
    final static Coin Cent = new Coin("Cent", 0.01);

    private final List<Coin> coins;

    public Purse() {
        coins = new ArrayList<>();
    }

    public void add(Coin coin) {
        coins.add(coin);
    }

    public boolean find(Coin coin) {
        for (Coin aCoin : coins) {
            if (aCoin.equals(coin))
                return true;
        }
        return false;
    }

    public int count(Coin coin) {
        int cont = 0;
        for (Coin aCoin : coins) {
            if (aCoin.equals(coin))
                cont++;
        }
        return cont;
    }

    public Coin getMinimum() {
        Coin min = coins.get(0);
        for (Coin coin : coins) {
            if (coin.getValue() < min.getValue())
                min = coin;
        }
        return min;
    }

    public Coin getMaximum() {
        Coin max = coins.get(0);
        for (Coin coin : coins) {
            if (coin.getValue() > max.getValue())
                max = coin;
        }
        return max;
    }

    public double getTotal() {
        double total = 0;
        for (Coin coin : coins) {
            total += coin.getValue();
        }
        return total;
    }

    public void remove(Coin coin) {
    for(int i = 0; i < coins.size(); i++)
        if(coins.get(i).equals(coin))
            coins.remove(i);
    }

    public boolean hasCoin(Coin coin) {
        for (Coin aCoin : coins) {
            if (aCoin.equals(coin))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Purse[Dollar = " + count(Dollar) + ", Quarter = " + count(Quarter) + ", Dime = " + count(Dime) + ", Nickel = " + count(Nickel) + ", Cent = " + count(Cent) + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;

        Purse purse = (Purse) o;
        String s1 = this.toString();
        String s2 = o.toString();
        return s1.equals(s2);
    }

}


