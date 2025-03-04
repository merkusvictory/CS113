import java.util.Random;
import java.util.Scanner;

public class TestEV {
    public static void main (String[] args) {
    
    Random gen = new Random();
    Scanner scan = new Scanner(System.in);
    EV ev1 = new EV(gen.nextInt(51) + 250, "Tesla Model S");
    
    System.out.print("Enter a desired model for EV2: ");
    String modelInput = scan.nextLine();
    System.out.print("Enter a desired range for EV2: ");
    int rangeInput = scan.nextInt();

    EV ev2 = new EV(rangeInput, modelInput);

    if(ev1.compareTo(ev2) == 1)
        System.out.println(ev1);
    else if(ev1.compareTo(ev2) == 0)
        System.out.println("same");
    else
        System.out.println(ev2);

    if(ev1.sameModel(ev2)) 
        System.out.println("same model");
    else
        System.out.println("different model");
    }
}
