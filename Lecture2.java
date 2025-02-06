// String literal - represented by putting double quotes around the text
// Example: "X", "123 Main Street"

// Every character string is an object in Java, defined by String class
// String literal represents a String object

// String Concatenation (+)
// can append a number to a string
// can also be used to break one long string
// operates left to right

// Escape Sequences (\)
// series of characters to represent special characters
// Examples: \n, \t,\b, \*

// Variable
// must be declared first

// Variable Declaration:
// example: int total;

// Variable Initialization:
// immediately assigns value
// example: int sum = 0;

// Assignment Statement:
// changes the value of a variable, must be consistent with its datatype
// example: total = 55;

// Constant:
// holds the same value during its entire existence
// keyword final
// final int MIN_HEIGHT = 69;

// Primitive Data types:

// Four represent integers
// byte, short, int, long
// byte gives 8 bits -128 to 127
// short can store 16 bits -32,768 to 32,767
// int can store 32 bits

// Two represent floating point numbers
// float, double
// float uses 32 bits
// double uses 64 bits (better precision)

// One represents characters
// char
// char stores a single character in 16 bits
// char topGrade = 'A' single quotes

// One represents boolean
// boolean 
// reserved words true and false

// Arithmetic Expressions:
// Division: / --> If at least one number is a floating point, then the result is a float
// example: 9/2 = 4, 9/2.0 = 4.5

// Data Conversion
// widening conversion: small to big, not dangerous
// narrowing conversion: big to small, more dangerous risky for large numbers

// Assignment conversion
// Example: int dollars = 20; -> double money = dollars -> money would equal 20.0

// Promotion
// happens automatically when operators in expressions convert their operands
// Example:
// int count = 12;
// double sum = 490.27;
// result = sum/count; -> will become double

// Casting
// powerful dangerous technique for conversion
// Example:
// int total = 50;
// float result = (float) total / 6;

// float result = (float) total / 6.0;
// ^ errors because 6.0 becomes double, and narrowing from double to float will run an error

// Reading Input
// Scanner class must be imported
import java.util.Scanner;
// Create an object ot the class
// Scanner scan = new Scanner(System.in);
// new operator creates Scanner object
// Scanner can be used to invoke various input methods, such as
// answer = scan.nextLine();

public class Lecture2 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String answer = scan.nextLine();  //nextInt(); //nextDouble(); //next(); (uses whitespace to cut it off)
   }
}