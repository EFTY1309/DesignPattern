public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void setWidth(double width) {
        this.radius = width;
    }

    @Override
    public void setHeight(double height) {
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }
}
