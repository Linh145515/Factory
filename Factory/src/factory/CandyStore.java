package factory;

public abstract class CandyStore {

    // Factory Method 
    public abstract Candy createCandy(String type);

    public void orderCandy(String type) {
        Candy candy = createCandy(type);
        candy.produce();
    }
}