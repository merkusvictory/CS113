package homework.HW1;

import java.util.Scanner;

public class seconds {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // inputting seconds
        System.out.print("Enter time in seconds: ");
        int seconds = scan.nextInt();

        // finding minutes and updating seconds
        int minutes = seconds/60;
        seconds = seconds - minutes * 60;
        
        // finding hours and updating minutes
        int hours = minutes/60;
        minutes = minutes - hours * 60;

        // printing out final results
        System.out.print(hours + " hour(s), " + minutes + " minute(s), " + seconds + " second(s)");

    }
}
