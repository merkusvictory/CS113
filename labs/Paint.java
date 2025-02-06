//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************

// Lab 1
// By Marcus Hilario and Shivansh Dutta

import java.util.Scanner;
public class Paint
{
   public static void main(String[] args)
   {
      final int COVERAGE = 350; //paint covers 350 sq ft/gal
      final int DOOR_AREA = 20;
      final int WINDOW_AREA = 15;
      int length, width, height, doors, windows;
      double totalSqFt, paintNeeded;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Please enter room dimensions");
      System.out.print("Length: ");
      length = scan.nextInt();
      System.out.print("Width: ");
      width = scan.nextInt();
      System.out.print("Height: ");
      height = scan.nextInt();
      System.out.print("Doors: ");
      doors = scan.nextInt();
      System.out.print("Windows: ");
      windows = scan.nextInt();
      
      System.out.println(" ");
      
      totalSqFt = (2 * length * height) + (2 * width * height) - (doors * DOOR_AREA + windows * WINDOW_AREA);
      paintNeeded = totalSqFt / COVERAGE;
      
      System.out.println("Length in feet: " + length);
      System.out.println("Width in feet: " + width);
      System.out.println("Height in feet: " + height);
      System.out.println("Gallons of paint needed: " + paintNeeded);
      
   }
}
