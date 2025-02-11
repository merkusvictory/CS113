/* Write a program that creates 2 dice and
 * rolls each one of them I HEAR MY FOOTSTEPS EVERY TIME
 */

public class TestDie {
    public static void main (String[] args) {
        Die die1 = new Die();
        // constructor for die

        System.out.println(die1);
        // print address of die1 in memory
        die1.roll();
        System.out.println(die1.getFaceValue());
    }
}
