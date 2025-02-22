public class MyMethods {
    public int diceStats(Die d1, Die d2) {
        int count = 0;
        while(!d1.equals(d2)) {
            count++;
            d1.roll();
            d2.roll();
        }
        return count;
    }
}
