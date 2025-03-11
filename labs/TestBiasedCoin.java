// Marcus Hilario
// Shivansh Dutta

public class TestBiasedCoin {
    public static void main (String[] args) {
        BiasedCoin coin1 = new BiasedCoin();
        BiasedCoin coin2 = new BiasedCoin(0.8);
        BiasedCoin coin3 = new BiasedCoin(0.2);

        int headCount1 = 0, headCount2 = 0, headCount3 = 0;

        for (int i = 1; i <= 100; i++) {
            coin1.flip();
            if (coin1.isHeads())
                headCount1++;
            coin2.flip();
            if (coin2.isHeads())
                headCount2++;
            coin3.flip();
            if (coin3.isHeads())
                headCount3++;
        }

        System.out.println("Coin 1 Number of Heads: " + headCount1);
        System.out.println("Coin 2 Number of Heads: " + headCount2);
        System.out.println("Coin 3 Number of Heads: " + headCount3);
    }
}


