// variable holds a primitive value or reference to an object
// class name used as a type to declare an object reference variable


import java.util.Random;

public class Lecture3 {
    public static void main (String[] args) {
        String title;
        // No object was created with this declaration
        // Null object reference
        
        // use the new operator to create an object
        // creating an object is called instantiation

        // object is an instance of a particular class

        title = new String("Java Software Solutions");
        
        int numChars = title.length();
        // once an object is instantiated, we can use the dot operator to invoke its methods
        // asks object to perform a service

        int num1 = 38; // primitive: value of num1 is 38
        String name1 = "Steve Jobs"; // object: value of name1 is an address that points to Steve Jobs
        String name2 = name1; // value of name2 is now the same address as name1, pointing to Steve Jobs
        name1 = "Steve Wozniak";

        System.out.println(name2);

        // Garbage collection - when an object has no more use D:
        
        // the String class - new operator is not required to create string objects

        title = "Java Software Solutions";
        // special syntax that works only for strings

        // to get last index -> t.length - 1
        // t.charAt(0) -> gives character at position zero
        // t.substring(0,2) -> slices [0:2]
        // t.substring(7) -> overloading method, method with same name but different parameters, slices [7:]

        String phrase = "Change is inevitable";
        String mutation1, mutation2, mutation3, mutation4;

        System.out.println("Original stringL \"" + phrase + "\"");
        System.out.println("Length of string: " + phrase.length());

        mutation1 = phrase.concat(", except from vending machines.");
        mutation2 = mutation1.toUpperCase();
        mutation3 = mutation2.replace('E', 'X');
        mutation4 = mutation3.substring(3,30);

        System.out.println(mutation1 + mutation2 + mutation3 + mutation4);

        // The Random and Math Classes
        
        // class libarary - collection of classes that we can use when developing programs
        // Java standard class library -> part of Java learning environment

        //examples of packages
        // java.lang - General support
        // java.util - Utilities
        // java.net - Network communication
        // javasfx.scene.shape - Graphical shapes

        // import declaration
        // import java.util.Scanner; -> using just the class name
        // import java.util.* -> imports all classes from package

        // Random class - generates random numbers
        Random generator = new Random();
        float num2;
        
        num1 = generator.nextInt();
        System.out.println("A random integer: " + num1);

        num1 = generator.nextInt(10);
        System.out.println("From 0 to 9: " + num1);
        // to shift the range, just add or subtract to the randomly generated number

        num2 = generator.nextFloat();
        System.out.println("A random float (between 0-1): " + num2); // 0.0 to 5.999999

        // Math Class
        // part of java.lang package (default)
        // includes absolute value, square root, exponentiation, trigonometric functions

        // static methods only invoked through class name, no object of the Math class is needed

        double value = Math.cos(90) + Math.sqrt(1);

        // Math.random() -> double [0 - 1] exclusive

        // Formatting Output
        // creating formatting object
        // get CurrencyInstance()
        // get PercentInstance()
        // import java.text.NumberFormat

        // DecimalFormat used to truncate decimal places

        // java.lang contains wrappper classes that correspond to each primitive type
        // title case full name - int -> Integer
    }
}