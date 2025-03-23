
// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;

public class Sales {

    public static int[] findMinStat(int[] salesArray) {
        int min_sale = salesArray[0];
        int min_id = 0;
        int[] returnArray = new int[2];
        for(int i = 0; i < salesArray.length; i++) {
            if(min_sale < salesArray[i]) {
                min_sale = salesArray[i];
                min_id = i;
            }
        }
        returnArray[0] = min_sale;
        returnArray[1] = min_id;
        return returnArray;
    }
    public static void main(String[] args) {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        sum = 0;
        double max_sale = 0;
        int max_id = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
            if (sales[i] > max_sale) {
                max_sale = sales[i];
                max_id = i;
            }
        }
        int[] minArray = findMinStat(sales);
        double avg = (double)sum / (double)SALESPEOPLE;
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sale per person: " + avg);
        System.out.println("\nSalesperson " + max_id + " had the highest sale with $" + max_sale);
        System.out.println("\nSalesperson " + minArray[1] + " had the lowest sale with $" + minArray[0]);
    }
}
