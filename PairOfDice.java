public class PairOfDice {
    // A)
    // write a class that represents a pair of dice
    // class contains two attributes to be two die objects, default constructor, getter, setter
    // tostring method that prints information about the dice
    // method roll pair that rolls the pair

    // B)
    // write a driver program "TestPairOfDice"
    // creates one pair of dice object
    // rolls the pair repeatedly until they have equal face values
    // prints to the screen it takes to hapen

    // attribute
    private Die d1;
    private Die d2;
    
    // default constructor - public method w/ no return type
    public PairOfDice() {
        d1 = new Die();
        d2 = new Die();
    }

    public Die getDie1() {
        return d1;
    }

    public Die getDie2() {
        return d2;
    }

    public void setDie1(Die newDie) {
        d1 = newDie;
    }

    public void setDie2(Die newDie) {
        d1 = newDie;
    }

    public String toString() {
        return d1 + ", " + d2.toString();
    }

    public void rollPair() {
        d1.roll();
        d2.roll();
    }
}
