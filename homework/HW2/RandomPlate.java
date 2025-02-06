package homework.HW2;

import java.util.Random;

public class RandomPlate {
    public static void main (String[] args) {
        Random generator = new Random();
        char letter1, letter2, letter3, letter4, letter5;
        // ask about generating random letters next class
        int num1 = generator.nextInt(10);
        int num2 = generator.nextInt(10);
        System.out.println("Plate Number: XXXXX" + num1 + num2);
    }
}
