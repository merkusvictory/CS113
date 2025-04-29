public class TestMCoins {
    public static void main (String[] args) {
        MonetaryCoin[][] coins = {{new MonetaryCoin((int)Math.ceil(Math.random() * 100)), new MonetaryCoin((int)Math.ceil(Math.random() * 100)), new MonetaryCoin((int)Math.ceil(Math.random() * 100)), new MonetaryCoin((int)Math.ceil(Math.random() * 100)), new MonetaryCoin((int)Math.ceil(Math.random() * 100))},
                                 {new MonetaryCoin((int)Math.ceil(Math.random() * 100)), new MonetaryCoin((int)Math.ceil(Math.random() * 100)), new MonetaryCoin((int)Math.ceil(Math.random() * 100)), new MonetaryCoin((int)Math.ceil(Math.random() * 100)), new MonetaryCoin((int)Math.ceil(Math.random() * 100))}};
        
        int total;

        for(int i = 0; i < coins.length; i++) {
            total = 0;
            for(int j = 0; j < coins[0].length; j++) {
                coins[i][j].flip();
                if(coins[i][j].isHeads()) {
                    total += coins[i][j].getValue();
                    System.out.println(coins[i][j].isHeads() + " " + coins[i][j].getValue());
                }
            }
            System.out.println(total + " ");
        }
    }
}
