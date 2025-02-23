package homework.HW4;

public class MyMethods {

    public int volume(int width, int length, int height) {
        return width * length * height;
    }

    public double avgFaceValues(Die d1, Die d2) {
        int d1face = d1.getFaceValue();
        int d2face = d2.getFaceValue();
        return (double)(d1face + d2face)/2;
    }
}
