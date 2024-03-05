public interface Shape extends Cloneable {
    double calculateArea();
    void setWidth(double width);
    void setHeight(double height);
    Shape clone();
}
