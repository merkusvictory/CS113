public class Lecture4 {
        // method declaration begins with a method header
    public static char calc(int num1, int num2, String message) {
        // char -> specifies return type
        // must ALWAYS have a return
        // void -> if you don't return anything
        //      -> can do return; to just break the function
        // calc -> method name
        // () -> parameters inside parentheses
        //    -> each param must have a type and name
        // {} -> contains body of method
        int sum = num1 + num2;
        char result = message.charAt(sum);
        // sum and result are local data
        // return expression must be consistent with type
        return result;
    }
    public static void main (String[] args) {
        char result = calc(1, 2, "hello");
        System.out.print(result);
    }
}

// object instantiation -> creating same object with same attributes, attribute values can vary