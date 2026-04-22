package bridge;

public class Client {
    public static void main(String[] args) {

        ShapeAbstract shape1 = new Circle(new RedColor());
        ShapeAbstract shape2 = new Square(new BlueColor());
        ShapeAbstract shape3 = new Rectangle(new GreenColor());

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
