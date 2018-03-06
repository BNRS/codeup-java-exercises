package shapes;

public class Rectangle {

    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

//    Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter () {
        return (2*(this.length+this.width));
    }
}


