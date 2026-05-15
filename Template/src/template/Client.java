package template;

public class Client {
	
	public static void main(String[] args) {
		PizzaRecipe cheesePizza = new CheesePizza();
		 System.out.println("=== Cheese Pizza ===");
	        cheesePizza.makePizza();

	        System.out.println();

	        PizzaRecipe seafoodPizza = new SeafoodPizza();

	        System.out.println("=== Seafood Pizza ===");
	        seafoodPizza.makePizza();
	    }
	}
