// ************************************************************
// Circle.java
//
// Print the area of a circle with two different radii
// ************************************************************

import java.util.Scanner;

public class Circle
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      final double PI = 3.14159;
      int radius;
      
      // First circle
      System.out.print("Choose an integer value for radius: ");
      radius = scan.nextInt();
      
      double area = PI * radius * radius;
      double circumference = 2 * PI * radius;
      
      System.out.println("The area of a circle with radius " + radius + " is " + area);
      System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
      System.out.println();
      
      // Second circle
      radius *= 2;
      area = PI * radius * radius;
      circumference = 2 * PI * radius;
      System.out.println("The area of a circle with radius " + radius + " is " + area);
      System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
   }
}