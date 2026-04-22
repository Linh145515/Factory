package bridge;

public class Circle extends ShapeAbstract {

    public Circle(ColorImplementation color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle with ");
        color.applyColor();
    }
}