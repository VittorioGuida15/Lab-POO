public class Car {
    private double gas;
    private final double consumptionRate;

    public Car(double consumptionRate){
        this.consumptionRate = consumptionRate;
        gas = 0;
    }

    public Car(double gas, double consumptionRate){
        this.consumptionRate = consumptionRate;
        this.gas = gas;
    }

    public double getGas() {
        return gas;
    }

    public void addGas(double gas) {
        this.gas += gas;
    }

    public void drive(double km) {
        double benzinaUsata = km / consumptionRate;
        if(benzinaUsata < gas)
            gas -= benzinaUsata;
        else System.out.println("Livello di carburate basso!");
    }
}