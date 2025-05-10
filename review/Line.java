public class Line extends Figure {
    Point p1;
    Point p2;

    public Line(Point p1, Point p2) {
        super("Line");
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getName() {
        return name;
    }

    public Point getPoint1() {
        return p1;
    }

    public Point getPoint2() {
        return p2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint1(Point p1) {
        this.p1 = p1;
    }

    public void setPoint2(Point p2) {
        this.p2 = p2;
    }

    public double perimeter() {
        return p1.distance(p2);
    }

    public boolean equals(Line line2) {
        return this.perimeter() == line2.perimeter();
    }

    public String toString() {
        return "line with vertices " + p1 + " and " + p2;
    }
}