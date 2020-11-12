
public class Rectangle {
    double width=1.0,height=1.0;
    Rectangle() {
    }
    Rectangle(double nwidth,double nheight) {
        width = nwidth;
        height = nheight;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }
}
