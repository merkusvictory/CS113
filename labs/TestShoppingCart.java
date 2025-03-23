// marcus hilario and ryan dempsey
import java.util.Scanner;

public class TestShoppingCart {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        boolean keepShopping = true;

        String newName;
        double newPrice;
        int newQuantity;

        int count = 0;
        while(keepShopping) {
            System.out.println("Product "+ (count+1) + ":");
            System.out.print("Enter the name of the product: ");
            newName = scan.nextLine();
            System.out.print("Enter the price of the product: ");
            newPrice = scan.nextDouble();
            System.out.print("Enter the quantity of the product: ");
            newQuantity = scan.nextInt();
            cart.addToCart(newName, newPrice, newQuantity);

            scan.nextLine();
            System.out.print("Do you want to continue shopping? [Y/N]: ");
            if (scan.nextLine().equals("N")) {
                keepShopping = false;
            }
            count++;
            System.out.println();
        }

        System.out.println(cart);
    }
}
