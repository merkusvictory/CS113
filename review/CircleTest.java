import java.util.Scanner;
public class CircleTest
{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Circle[] circleArray = new Circle[5];
        float radius;
        int x;
        int y;
        Point point;

        for(int i = 0; i < circleArray.length; i++) {
            System.out.print("Enter radius: ");
            radius = scan.nextFloat();
            System.out.print("Enter x value of center: ");
            x = scan.nextInt();
            System.out.print("Enter y value of center: ");
            y = scan.nextInt();
            point = new Point(x,y);
            circleArray[i] = new Circle(point, radius);
        }

        int count = 0;
        Point pointZero = new Point(0, 0);
        for(Circle circle : circleArray) {
            if(circle.liesOnCircle(pointZero))
                count++;
        }
        System.out.println(count);
    }
}
