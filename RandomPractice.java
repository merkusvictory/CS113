import java.util.Scanner;
import java.util.Random;

public class RandomPractice {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.print("Enter your first name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scan.nextLine();
        //String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int ranNum1 = generator.nextInt(firstName.length());
        int ranNum2 = generator.nextInt(lastName.length());

        String letNum1 = firstName.substring(ranNum1, ranNum1 + 1);
        String letNum2 = lastName.substring(ranNum2, ranNum2 + 1);

        char cletNum1 = firstName.charAt(ranNum1);
        char cletNum2 = lastName.charAt(ranNum2);

        System.out.print("" + cletNum1 + cletNum2);
    }
}
