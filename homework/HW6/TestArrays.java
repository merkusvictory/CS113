package homework.HW6;
import java.util.Random;
import java.util.Scanner;

public class TestArrays {
    public static int[] numberFreq()
    {
        Random gen = new Random();
        int ranNum;
        int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        int count = 0;
        int[] compilation = new int[6];
        while(count < 100) {
            ranNum = gen.nextInt(6);
            switch(ranNum) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
            }
            count++;
        }
        compilation[0] = count0;
        compilation[1] = count1;
        compilation[2] = count2;
        compilation[3] = count3;
        compilation[4] = count4;
        compilation[5] = count5;
        return compilation;
    }

    public static int[] fibo(int num) {
        int[] sequence = new int[num];
        int fibo1 = 1, fibo2 = 1;
        int count = 0;

        while(count < num) {
            switch(count) {
                case 0:
                    sequence[0] = fibo1;
                    break;
                case 1:
                    sequence[1] = fibo2;
                    break;
                default:
                    sequence[count] = fibo1 + fibo2;
                    fibo1 = fibo2;
                    fibo2 = sequence[count];
            }
            count++;
        }

        return sequence;
    }

    public static int oddDice(Die[] arrayDie) {
        int oddCount = 0;
        for (Die die : arrayDie) {
            die.roll();
            if (die.getFaceValue() % 2 != 0)
                oddCount += 1;
        }
        return oddCount;
    }

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        // testing numberFreq
        int[] generatedArray = numberFreq();
        for (int num : generatedArray)
            System.out.println(num);

        // testing fibo
        System.out.print("\nHow many fibonacci numbers would you like to see? ");
        int num = scan.nextInt();

        int[] generatedFibo = fibo(num);
        for (int fiboNum : generatedFibo)
            System.out.println(fiboNum);

        // testing oddDice
        Die[] arrayDie = {new Die(), new Die(), new Die(), new Die(), new Die(), new Die(), new Die(), new Die(), new Die(), new Die()};
        System.out.println("\nNumber of Odd Die: " + oddDice(arrayDie));
    }
}
