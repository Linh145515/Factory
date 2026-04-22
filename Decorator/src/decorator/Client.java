package decorator;

public class Client {

    public static void main(String[] args) {

        Component circle = new Circle();

        Component redCircle = new RedBorder(new Circle());

        System.out.println("Normal Circle:");
        circle.draw();

        System.out.println();

        System.out.println("Circle with Red Border:");
        redCircle.draw();
    }
}
