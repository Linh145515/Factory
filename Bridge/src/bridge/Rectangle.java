package bridge;

public class Rectangle extends ShapeAbstract {

    public Rectangle(ColorImplementation color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Rectangle with ");
        color.applyColor();
    }
}
