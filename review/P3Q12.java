public class P3Q12 {
    public static double[] bestInMonths(double[][] famCellBills) {
        int famLength = famCellBills.length;
        int monthLength = famCellBills[0].length;
        double[] returnArray = new double[monthLength];
        double monthMin = 9999999;
        for(int monthNum = 0; monthNum < monthLength; monthNum++) {
            monthMin = 99999999;
            for(int famNum = 0; famNum < famLength; famNum++) {
                if(famCellBills[famNum][monthNum] > monthMin) {
                    monthMin = famCellBills[famNum][monthNum];
                }
            }
            returnArray[monthNum] = monthMin;
        }
        return returnArray;
    }
}
