// STATIC CLASS MEMBERS

// static method - invoked through its class name
// ex. result = Math.sqrt(25)

// variables can be static

// static variable - only one copy of it exists
// ex. private static float price;
// creates memory space when the class is first reference
// defined in the class - shares static variables

// every static method can not have non static variables, but non static methods can have static variables
// static method can be called "class method"

// why can't a static method refer to an instance variable?
// Answer: because instance data is created only when an object is created, and you don't need an object to call a static method

// "this" keyword - takes place of 'self' in python
// ex. when constructing data, this.name = name; this.acctNumber = acctNumber;

public class Lecture6 {
    public static int cube(int num)
    {
        return num * num * num;
    }
    // bec its static, the cube method can be invoked through the class name
}