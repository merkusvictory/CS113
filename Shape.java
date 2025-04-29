public abstract class Shape {
    protected String shape_name;

    public Shape(String shape_name) {
        this.shape_name = shape_name;
    }

    public abstract double area();

    public String toString() {
        return shape_name;
    }
}