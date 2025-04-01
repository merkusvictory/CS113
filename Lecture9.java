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