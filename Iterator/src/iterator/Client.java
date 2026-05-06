package iterator;

public class Client {
	 public static void main(String[] args) {

	        ProductCollection collection = new ProductCollection();

	        collection.addProduct(new Product("Laptop", 10));
	        collection.addProduct(new Product("Mouse", 0));
	        collection.addProduct(new Product("Keyboard", 5));
	        collection.addProduct(new Product("Monitor", 0));

	        Iterator<Product> iterator = collection.createIterator();

	        System.out.println("Products in stock:");

	        while (iterator.hasNext()) {
	            Product p = iterator.next();
	            System.out.println(p.getName() + " - " + p.getQuantity());
	        }
	    }

}
