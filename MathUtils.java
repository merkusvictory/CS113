// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils {
    // -------------------------------------------------------------
    // Returns the factorial of the argument given
    // -------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException{
        if(n > 16)
            throw new IllegalArgumentException("Can't be over 16");
        if(n < 0)
            throw new IllegalArgumentException("Factorial function undefined for negative numbers");
        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }
}
