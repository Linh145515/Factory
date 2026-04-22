package bridge;

public abstract class ShapeAbstract {
    protected ColorImplementation color;

    public ShapeAbstract(ColorImplementation color) {
        this.color = color;
    }

    public abstract void draw();
}
