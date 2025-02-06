package homework.HW2;

import java.util.Scanner;

public class NameApp {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scan.next();
        System.out.print("Enter your last name: ");
        String lastName = scan.next();

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        double firstLength = firstName.length();
        double lastLength = lastName.length();
        double averageLength = (firstLength + lastLength)/2;

        System.out.println("Initials: " + firstInitial + lastInitial);
        System.out.println("Average length: " + averageLength);
    }
}
