package homework.HW1;

public class temperature {
    public static void main (String[] args) {
        double fahrenheit = 36.5;
        double celsius = (fahrenheit - 32) * 5/9;

        System.out.print("Temp in Fahrenheit: " + fahrenheit);
        System.out.print(", Temp in Celsius: " + celsius);
    }
}
