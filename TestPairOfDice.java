// Lab 4
// By Marcus Hilario and Shivansh Dutta

public class TestPairOfDice {
    public static void main (String[] args) {
        PairOfDice diePair = new PairOfDice();
        int count = 0;
        while(!diePair.getDie1().equals(diePair.getDie2())) {
            count++;
            diePair.rollPair();
            System.out.println(diePair);
        }
        System.out.println("Number of attempts until equal: " + count);

        PairOfDice diePair2 = new PairOfDice();
        count = 0;
        while(!(diePair2.getDie1().equals(diePair2.getDie2()) && (diePair2.getDie1().getFaceValue() == 2))) {
            count++;
            diePair2.rollPair();
            System.out.println(diePair2);
        }
        System.out.println("Number of attempts until both are 2: " + count);
    }
}
