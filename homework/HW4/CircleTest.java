package homework.HW4;

import java.util.Scanner;

public class CircleTest {
    public static void main (String[] args) {
        Point point1 = new Point((int)(Math.random() * 25 + 1), (int)(Math.random() * 25 + 1));
        Point point2 = new Point(0, 0);

        Scanner scan = new Scanner(System.in);
        System.out.print("Please type the desired radius for your circle: ");
        int givenRadius = scan.nextInt();

        Circle circle1 = new Circle(point1, givenRadius);
        Circle circle2 = new Circle(point2, 5);

        System.out.println("" + circle1 + circle2);
        if (circle1.equals(circle2)) {
            System.out.println("\nThe distance between their centers "
            + "if the two circles are equal to: " + circle1.getCenter().distance(circle2.getCenter()));
        }
        else {
            double circleCircum1 = circle1.circumference();
            double circleCircum2 = circle2.circumference();
            System.out.println("\nThe average circumference is " + ((circleCircum1 + circleCircum2)/2) + "\n");
        }
    }
}
