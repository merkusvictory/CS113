/* Write a program that creates 2 dice and
 * rolls each one of them I HEAR MY FOOTSTEPS EVERY TIME
 */

public class TestDie {
    public static void main (String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        MyMethods count_obj = new MyMethods();

        System.out.println("Number of attempts: " + count_obj.diceStats(die1, die2));
    }
}
