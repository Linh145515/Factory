package template;

public class SeafoodPizza extends PizzaRecipe {

    @Override
    protected void addSauce() {
        System.out.println("Adding seafood sauce...");
    }

    @Override
    protected void addToppings() {
        System.out.println("Adding shrimp and squid...");
    }
}
