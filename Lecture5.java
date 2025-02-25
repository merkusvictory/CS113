public class Lecture5 {
    public static void main (String[] args) {
        //switch statement finds exact value
        // if there's no break, it'll assume the rest of them are also true regardless of match
        char option = 'A';
        switch (option) {
            case 'A':
                System.out.println("A");
                break;
        }

        final int PER_LINE = 5;

        int limit = 500;
        int value = 7;

        for (int count = 1; (value * count) <= limit; count++) {
            System.out.print(value * count + " ");
            if (count % PER_LINE == 0) {
                System.out.println("");
            }
        }

        // do {
        //     System.out.println("dunggeulge dunngeulge");
        // }
        // while (true);
    }
}

// conditional operator
// variable = (condition) ? result1 : result2
// if condition is true, variable = result1
// if false, variable = result2

// do while
// do comes first before while
// if while is true, it'll go back to do
// guarantees one run

// for loop
// for (initialize counting variable; condition; iterator) {

// }

// switch
// conditional operator
// do loop
// for loop