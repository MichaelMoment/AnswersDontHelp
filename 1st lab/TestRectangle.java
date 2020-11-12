
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle square = new Rectangle();
        Rectangle rect = new Rectangle(7.0,9.645);
        System.out.printf("Width: %.1f Height: %.1f Area: %.1f Perimeter: %.1f\n",square.width,square.height,square.getArea(),square.getPerimeter());
        System.out.printf("Width: %.1f Height: %.1f Area: %.1f Perimeter: %.1f\n",rect.width,rect.height,rect.getArea(),rect.getPerimeter());

    }
}
