package iterator;


public class ProductIterator implements Iterator<Product> {
    private ProductCollection collection;
    private int index = 0;

    public ProductIterator(ProductCollection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        while (index < collection.getProducts().size()) {
            if (collection.getProducts().get(index).isInStock()) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Product next() {
        return collection.getProducts().get(index++);
    }
}