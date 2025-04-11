
// ******************************************************************
// DigitPlay.java
//
// Finds the number of digits in a positive integer.
// ******************************************************************
import java.util.Scanner;

public class DigitPlay {
    public static void main(String[] args) {
        int num; // a number
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Please enter a positive integer: ");
        num = scan.nextInt();
        if (num <= 0)
            System.out.println(num + " isn't positive -- start over!!");
        else {
            // Call numDigits to find the number of digits in the number
            // Print the number returned from numDigits
            System.out.println("\nThe number " + num + " contains " +
                    +numDigits(num) + " digits.");
            System.out.println();
            System.out.println("The number " + num + " sums its digits up to " + sumDigits(num) + "\n");
            printInReverse(num);
            System.out.println(convertBinary(num, 2));
        }
    }

    // -----------------------------------------------------------
    // Recursively counts the digits in a positive integer
    // -----------------------------------------------------------
    public static int numDigits(int num) {
        if (num < 10)
            return (1);
        else
            return (1 + numDigits(num / 10));
    }

    public static int sumDigits(int num) {
        if (num < 10)
            return num;
        else
            return ((num % 10) + sumDigits(num / 10));
    }

    public static void printInReverse(int num) {
        if (num < 10)
            System.out.println(num);
        else {
            System.out.println(num % 10);
            printInReverse(num / 10);
        }
    }

    public static String convertBinary(int num, int base) {
        if (num == 0) {
            return "";
        }
        else
            return convertBinary(num/base, base) + "" + num % base;

    }

}
