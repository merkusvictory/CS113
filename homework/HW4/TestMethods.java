package homework.HW4;

public class TestMethods {
    public static void main (String[] args) {
        MyMethods method = new MyMethods();
        Die d1 = new Die();
        Die d2 = new Die();
        
        System.out.println(method.volume(5,3,4));
        System.out.println(method.avgFaceValues(d1, d2));
    }
}
