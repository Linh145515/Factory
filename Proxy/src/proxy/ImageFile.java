package proxy;

public class ImageFile implements DisplayObject {

    private String url;

    public ImageFile(String url) {
        this.url = url;
        readImage();
    }

    private void readImage() {
        System.out.println("Loading image from disk: " + url);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + url);
    }
}