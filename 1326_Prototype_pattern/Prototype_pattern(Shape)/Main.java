public class Main {
    public static void main(String[] args) {
        Circle circlePrototype = new Circle(5);

        Circle circle = (Circle) circlePrototype.clone();
        circle.setWidth(10); 
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectanglePrototype = new Rectangle(3, 4);

        Rectangle rectangle = (Rectangle) rectanglePrototype.clone();
        rectangle.setWidth(6);
        rectangle.setHeight(8);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
