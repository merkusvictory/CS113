package homework.HW7;

public class Test2DArrays {
    public static int[] salesRange(int[][] sales) {
        int maxSale = 0;
        int minSale = sales[0][0];

        for(int[] saleRow : sales) {
            for(int saleValue : saleRow) {
                if (saleValue > maxSale) {
                    maxSale = saleValue;

                }
                if (saleValue < minSale) {
                    minSale = saleValue;
                }
            }
        }
        int[] returnArray = {minSale, maxSale, maxSale - minSale};

        return returnArray;
    }

    public static int[] dieStats(Die[][] dice) {
        int oddInRow, maxOddInRow;
        Die[] dieRow = new Die[dice.length];
        int[] returnArray = new int[dice.length];

        System.out.print("\n\nDie Face Values");
        for(int dieRowIndex = 0; dieRowIndex < dice.length; dieRowIndex++) {
            dieRow = dice[dieRowIndex];
            oddInRow = 0;
            maxOddInRow = 0;
            System.out.print("\nRow " + (dieRowIndex+1) + ": ");
            for(Die die : dieRow) {
                die.roll();
                System.out.print(die.getFaceValue());
                if(die.getFaceValue() % 2 != 0)
                    oddInRow++;
                else {
                    if (oddInRow > maxOddInRow)
                        maxOddInRow = oddInRow;
                    oddInRow = 0;
                }
            }
            if (oddInRow > maxOddInRow)
                maxOddInRow = oddInRow;
            returnArray[dieRowIndex] = maxOddInRow;
        }

        return returnArray;
    }
    public static void main (String[] args) {
        int[][] sales = {
            {200,350,400},
            {150,375,225}
        };
        
        int[] salesRangeResult = salesRange(sales);
        for(int num : salesRangeResult) {
            System.out.print(num + " ");
        }

        Die[][] dice = {
            {new Die(), new Die(), new Die()},
            {new Die(), new Die(), new Die()}
        };

        int[] dieStatsResult = dieStats(dice);
        System.out.println("\nFunction Output:");
        for(int stat : dieStatsResult) {
            System.out.print(stat + " ");
        }
    }
}
