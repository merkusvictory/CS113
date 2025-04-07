package review;

public class Circle
{
    private Point center;
    private float radius;

    public Circle(Point newCenter, float newRadius) {
        center = newCenter;
        radius = newRadius;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(float newRadius) {
        radius = newRadius;
    }

    public boolean liesOnCircle(Point p1) {
        double distance = center.distance(p1);
        double circDistance = radius;
        if(distance == circDistance)
            return true;
        return false;
    }
}
