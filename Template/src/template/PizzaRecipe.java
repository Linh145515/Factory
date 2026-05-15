package template;

public abstract class PizzaRecipe {

    // Template Method
    public final void makePizza() {

        prepareDough();
        addSauce();
        addToppings();
        bake();
        cut();
    }

    protected void prepareDough() {
        System.out.println("Preparing dough...");
    }

    protected void bake() {
        System.out.println("Baking pizza...");
    }

    protected void cut() {
        System.out.println("Cutting pizza...");
    }

    // Different steps
    protected abstract void addSauce();

    protected abstract void addToppings();
}