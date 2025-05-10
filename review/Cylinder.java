public class Cylinder extends Circle2{
    private double height;

    public Cylinder(double r, double height) {
        super(r);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean equals(Cylinder c) {
        return (height == c.getHeight() && radius == c.getRadius());
    }
    
    public double area() {
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }

    public String toString() {
        return "Cylinder with radius of " + radius + " and height of " + height;
    }
}