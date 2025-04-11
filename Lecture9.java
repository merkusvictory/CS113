public class Lecture9 {

    public static int factorialNonRec(int n) {
        int total = n;
        int rounds = n;
        while(rounds > 1) {
            total = total * (rounds-1);
            rounds--;
        }
        return total;
    }

    public static int factorialRec(int n) {
        if(n==1)
            return 1;
        else
            return n * factorialRec(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorialNonRec(5));
        System.out.println(factorialRec(5));
    }
    public class Car extends Vehicle {
        // class contents
    }

}

// RECURSION
// defining itself
// base case (stopping case) and recursive case
// if no base case, it's infinite recursion
// invokes itself
// 

// example:
// Defining Factorial
// For N!
//      1! = 1          , N = 1
//      N! = N * (N-1)! , N > 1

// INHERITANCE
// child class inheriting from parent class
// keyword extends
// protected - keyword for variable only visible to child, but not to anything else
// child inherits variables and methods of parent (depends on visibiliy modifiers)
// constructors are not inherited
// super reference - constructs the parent class with given parameters
//                 - important bec you can't initialize parent data
//                 - must be done first, RESPECT
// classes can not have more than one parent, not java supported
// parents can have as many children that they want
// children can be parents
// overriding methods, child override the def of a parent method by creating a method with the same header
// final - modifier can also be used in front of a method, child can't change it
// no class is an orphan
// Object - parent of all objects
//        - has toString that returns the address
//        - equals