package homework.HW10;

import java.util.Scanner;

public class TestExecutive {
    public static void main (String[] args) throws BonusTooHighException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Size of Executive Array: ");
        int arraySize = scan.nextInt();
        String name, address, phone, ssn;
        double rate, bonus;

        Executive[] execArray = new Executive[arraySize];

        for(int i = 0; i < arraySize; i++) {
            scan.nextLine();
            System.out.print("\nEnter Name #" + (i+1) + " ");
            name = scan.nextLine();
            System.out.print("Enter Address #" + (i+1) + " ");
            address = scan.nextLine();
            System.out.print("Enter Phone #" + (i+1) + " ");
            phone = scan.nextLine();
            System.out.print("Enter SSN #" + (i+1) + " ");
            ssn = scan.nextLine();
            System.out.print("Enter Pay Rate #" + (i+1) + " ");
            rate = scan.nextDouble();
            System.out.print("Enter Bonus Award #" + (i+1) + " ");
            bonus = scan.nextDouble();
            execArray[i] = new Executive(name, address, phone, ssn, rate);
            execArray[i].awardBonus(bonus);
        }
    }
}
