public class MonetaryCoin extends Coin {
    private int value;

    public MonetaryCoin(int value) {
        super();
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return super.toString() + " with value " + value;
    }
}
