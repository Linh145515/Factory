package bridge;

public class Square extends ShapeAbstract {

    public Square(ColorImplementation color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Square with ");
        color.applyColor();
    }
}