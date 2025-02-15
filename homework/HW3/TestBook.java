package homework.HW3;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        String title1, title2;
        int pageCount1, pageCount2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first book name: ");
        title1 = scan.nextLine();
        System.out.print("Enter number of pages: ");
        pageCount1 = scan.nextInt();
        scan.nextLine(); // takes away the newline character after int

        Book book1 = new Book(title1, pageCount1);

        System.out.print("\nEnter second book name: ");
        title2 = scan.nextLine();
        System.out.print("Enter number of pages: ");
        pageCount2 = scan.nextInt();

        Book book2 = new Book(title2, pageCount2);

        int average = (book1.getPageCount() + book2.getPageCount())/2;

        System.out.println("\nBook 1: " + book1);
        System.out.println("Book 2: " + book2);
        System.out.println("Average number of pages: " + average);
    }
}
