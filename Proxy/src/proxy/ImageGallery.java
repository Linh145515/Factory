package proxy;

public class ImageGallery {

    public static void main(String[] args) {

        DisplayObject image1 = new ImageProxy("cat.jpg");
        DisplayObject image2 = new ImageProxy("dog.jpg");

        System.out.println("Images created.");

        System.out.println("\nDisplaying first image:");
        image1.display();

        System.out.println("\nDisplaying second image:");
        image2.display();

        System.out.println("\nDisplaying first image again:");
        image1.display();
    }
}