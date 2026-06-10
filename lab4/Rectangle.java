package lab4;

public class Rectangle {

    private double length = 1.0;
    private double width = 1.0;

    public Rectangle() {}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calcArea() {
        return length * width;
    }

    public double calcPerimeter() {
        return 2 * length + 2 * width;
    }

    public String toString() {
        return String.format("Rectangle[length=%.2f,width=%.2f]", length,width);
    }
}
