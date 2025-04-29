
//***********************************************************
// PaintThings.java
//
// Computes the amount of paint needed to paint various
// things. Uses the amount method of the paint class which
// takes any Shape as a parameter.
//***********************************************************
import java.text.DecimalFormat;

public class PaintThings {
    // -----------------------------------------
    // Creates some shapes and a Paint object
    // and prints the amount of paint needed
    // to paint each shape.
    // -----------------------------------------
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        Rectangle deck;
        Sphere bigBall;
        double deckAmt, ballAmt;
        // Instantiate the two shapes to paint
        Shape sphere = new Sphere(3.14);
        Shape rect = new Rectangle(3, 14);
        // Compute the amount of paint needed for each shape
        deckAmt = paint.amount(rect);
        ballAmt = paint.amount(sphere);

        // Print the amount of paint for each.
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
    }
}
