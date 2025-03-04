package homework.HW5;

import java.util.Scanner;

public class TestDog {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        String breed;
        int age;
        int totalDogCount;

        System.out.print("Number of dogs in the kennel: ");
        totalDogCount = scan.nextInt();
        System.out.println();

        int count = 0;

        Dog currentDog;
        Dog oldestDog = new Dog(0, "");

        int totalAge = 0;
        while(count < totalDogCount) {
            scan.nextLine();
            count++;
            System.out.print("Enter Dog breed: ");
            breed = scan.nextLine();
            System.out.print("Enter age: ");
            age = scan.nextInt();
            currentDog = new Dog(age, breed);
            totalAge += age;
            if (currentDog.compareTo(oldestDog) == 1)
                oldestDog = currentDog;
        }
        double averageAge = ((double)totalAge)/count;
        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest Dog -> " + oldestDog);

    }
}