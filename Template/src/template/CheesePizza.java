package template;

public class CheesePizza extends PizzaRecipe {

    @Override
    protected void addSauce() {
        System.out.println("Adding cheese sauce...");
    }

    @Override
    protected void addToppings() {
        System.out.println("Adding mozzarella cheese...");
    }
}
