public class Die {
    // attribute
    private int faceValue = (int)(Math.random() * 6 + 1);;
    
    // roll method
    public void roll() {
        faceValue = (int)(Math.random() * 6 + 1);
    }

    // getter method - sole purpose of obtaining a value
    public int getFaceValue() {
        return faceValue;
    }
}