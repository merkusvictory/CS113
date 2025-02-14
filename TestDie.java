/* Write a program that creates 2 dice and
 * rolls each one of them I HEAR MY FOOTSTEPS EVERY TIME
 */

public class TestDie {
    public static void main (String[] args) {
        Die die1 = new Die();
        // constructor for die

        System.out.println(die1);
        // print address of die1 in memory
        System.out.println(die1.getFaceValue()); // default val
        die1.roll();
        System.out.println(die1.getFaceValue());

        Die die2 = new Die(4);
        System.out.println(die2.getFaceValue());

        System.out.println(die1 + "\n" + die2.toString());
    }
}
