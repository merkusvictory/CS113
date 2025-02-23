package homework.HW4;

public class Circle {
    
    private Point center;
    private int radius;

    public Circle (Point newCenter, int newRadius) {
        center = newCenter;
        radius = newRadius;
    }

    public String toString() {
        return "The radius of the circle is " + radius + " and the center is at point " + center + ".";
    }

    public Point getCenter () {
        return center;
    }

    public int getRadius () {
        return radius;
    }

    public void setCenter (Point newCenter) {
        center = newCenter;
    }

    public void setRadius (int newRadius) {
        radius = newRadius;
    }

    public boolean equals (Circle circle2) {
        return (radius == circle2.getRadius());
    }

    public double circumference () {
        return 2*3.14*radius;
    }
}
