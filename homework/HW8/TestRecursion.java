package homework.HW8;

public class TestRecursion {
    public static void printDigits(int num) {
        String numString = num + "";
        if(numString.length() == 1)
            System.out.println(numString);
        else {
            System.out.println(numString.charAt(0));
            printDigits(Integer.parseInt(numString.substring(1)));
        }
    }
    public static int sumArray(int[] numArray, int count) {
        if (count == 1) {
            return numArray[0];
        }
        else {
            return sumArray(numArray, count - 1) + numArray[count - 1];
        }
    }
    public static void main(String args[]) {
        printDigits(1234567);
        int[] a = {1,3,2,5};
        System.out.println(sumArray(a,4));
    }
}
