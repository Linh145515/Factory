package proxy;

public class ImageProxy implements DisplayObject {

    private String url;
    private ImageFile imageFile;

    public ImageProxy(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        if (imageFile == null) {
            imageFile = new ImageFile(url);
        }
        imageFile.display();
    }
}