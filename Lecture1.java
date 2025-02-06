// Java Lecture 1
// uses classes

// methods are same thing as functions from Python

// main -> header that always stay the same, execution starts from main

// parts of method: header, title, return type

// Steps to make an executable:
// 1) create the source code
// 2) file name must be the same name as the class (Lecture1.java)

// Steps in running program:
// 1) Compile using javaC -> compiler goes through lines of code and applies syntax rules
// 2) Generate new file "bytecode" named Lincoln.class
// 3) Interprets bytecode and runs it using an interpreter (java virtual machine)

// Identifiers:
// "words" in a program, can be made of letters, digits, dollars, and underscores (but can't start with digit)
// similar to variables
// can use conventions: uppercase for constants, title case for classes, lowercase for variables
// java reserved words exist, which can't be used as identifier names

// White Space:
// spaces, blank lines, tabs
// separate words and symbols in a program
// extra white space is ignored

public class Lecture1 // class
{
   public static void main (String[] args) // method header
   // void means function returns nothing
      {
         // method body
         System.out.println("A quote by Abraham Lincoln:"); // to print text and move to a new line
         System.out.println("Whatever you are, be a good one.");
      }
}
