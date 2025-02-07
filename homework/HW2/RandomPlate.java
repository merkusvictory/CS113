package homework.HW2;

import java.util.Random;

public class RandomPlate {
    public static void main (String[] args) {
        Random generator = new Random();
        char letter1, letter2, letter3, letter4, letter5;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // generating random letters
        int ran1 = generator.nextInt(26);
        letter1 = alphabet.charAt(ran1);
        int ran2 = generator.nextInt(26);
        letter2 = alphabet.charAt(ran2);
        int ran3 = generator.nextInt(26);
        letter3 = alphabet.charAt(ran3);
        int ran4 = generator.nextInt(26);
        letter4 = alphabet.charAt(ran4);
        int ran5 = generator.nextInt(26);
        letter5 = alphabet.charAt(ran5);

        // generating random numbers
        int num1 = generator.nextInt(10);
        int num2 = generator.nextInt(10);
        System.out.println("Plate Number: " + letter1 + letter2 + letter3 + letter4 + letter5 + num1 + num2);
    }
}
