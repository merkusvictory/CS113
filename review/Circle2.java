public class Circle2
{
protected double radius;
public Circle2(double r) {
radius=r;
}
public void setRadius(double r) {
radius = r;
}
public double getRadius() {
return radius;
}
public double area() {
return Math.PI * radius * radius;
}
public String toString() {
return "Circle:Radius= " + radius;
}
}