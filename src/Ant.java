public abstract class Ant {

    private int numberAvailable;

    public Ant(int numberAvalable) {
        this.numberAvailable = numberAvalable;
    }

    public int getNumberAvailable() {
        return numberAvailable;
    }

    public void setNumberAvailable(int numberAvailable) {
        this.numberAvailable = numberAvailable;
    }

    public void increaseAntNumber(int n) {
        numberAvailable += n;
    }

    public void decreaseAntNUmber(int n) {
        numberAvailable -= n;
    }
}
