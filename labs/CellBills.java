// By Marcus Hilario and Shivansh Dutta
public class CellBills {
    static public double[] bestInMonths(double[][] famCellBills) {
        double[] bestBill = new double[famCellBills[0].length];
        double minBill;

        for(int billNum = 0; billNum < famCellBills[0].length; billNum++) {
            minBill = 999999;
            for(int member = 0; member < famCellBills.length; member++) {
                if(famCellBills[member][billNum] < minBill) {
                    minBill = famCellBills[member][billNum];
                }
            }
            bestBill[billNum] = minBill;
        }
        return bestBill;
    }
    public static void main (String[] args) {
        double[][] famCellBills = {{34.56, 75.34, 23.87},
                                  {87.79, 32.05, 23.54},
                                  {89.78, 66.76, 87.99},
                                  {45.34, 56.45, 16.54}};
        
        double[] bestBill = bestInMonths(famCellBills);

        for (double num : bestBill)
            System.out.println(num);
    }
}
