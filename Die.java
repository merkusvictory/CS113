public class Die {
    // attribute
    private int faceValue; // encapsulating
    
    // default constructor - public method w/ no return type
    public Die() {
        roll();
    }

    // constructor with parameters
    public Die(int num) {
        faceValue = num;
    }

    // roll method
    public void roll() {
        faceValue = (int)(Math.random() * 6 + 1);
    }

    // getter method - sole purpose of obtaining a value
    public int getFaceValue() {
        return faceValue;
    }

    // toString method
    public String toString() {
        String result = "Die with face value " + faceValue;
        return result;
    }

    // setter method - void method w/ parameters
    public void setFaceValue(int newFace) {
        faceValue = newFace;
    }

    // equals method
    public boolean equals(Die d2) {
        return faceValue == d2.faceValue;
    }

    // compareTo method
    public int compareTo(Die d2) {
        if (faceValue < d2.faceValue)
            return -1;
        else if (faceValue > d2.faceValue)
            return 1;
        else
            return 0;
    }
}