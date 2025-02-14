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
}