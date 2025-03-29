public class CoinStreak {
    public static void main (String args[]) {
        Coin coin = new Coin();
        final int FLIPS = 100;

        int headStreak = 0;
        int longestHeadStreak = 0;
        for(int flipNum = 0; flipNum < FLIPS; flipNum++) {
            coin.flip();
            if(coin.isHeads()) {
                headStreak += 1;
            }
            else {
                if (headStreak > longestHeadStreak)
                    longestHeadStreak = headStreak;
                headStreak = 0;
            }
        }

        System.out.println("Current Head Streak: " + headStreak);
        System.out.println("Longest Head Streak: " + longestHeadStreak);

        Coin[] coins = {new Coin(), new Coin(), new Coin(), new Coin(), new Coin(), new Coin(), new Coin(), new Coin(), new Coin(), new Coin()},
        boolean[] coinHeadOver10 = {false, false, false, false, false, false, false, false, false, false};

        headStreak = 0;
        boolean achieved10 = false;
        for (Coin eachCoin : coins) {
            headStreak = 0;
            achieved10 = false;
            for(int flipNum = 0; flipNum < FLIPS; flipNum++) {
                eachCoin.flip();
                if(eachCoin.isHeads()) {
                    headStreak += 1;
                }
                else {
                    if(headStreak >= 10)
                        achieved10 = true;
                        break;
                    headStreak = 0;
                }
            }
        }
}
}
