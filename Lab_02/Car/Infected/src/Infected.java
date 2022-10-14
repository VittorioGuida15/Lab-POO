public class Infected {

    private final String disease;
    private int numberOfInfected;

    public Infected(String disease) {
        this.disease = disease;
        numberOfInfected = 0;
    }

    public Infected(String disease, int numberOfInfected) {
        this.disease = disease;
        this.numberOfInfected = numberOfInfected;
    }

    public int getNumberOfInfected() {
        return numberOfInfected;
    }

    public String getDisease() {
        return disease;
    }

    public void addInfected(int numberOfInfected) {
        this.numberOfInfected += numberOfInfected;
    }

    // rt = numero infetti / 1000
    public void updateInfectedByRt(double rt) {
        numberOfInfected = (int) (rt * 1000);
    }
}