package factory;

public class SimpleCandyStore extends CandyStore {

    @Override
    public Candy createCandy(String type) {

        if (type.equalsIgnoreCase("chocolate")) {
            return new ChocolateCandy();
        } 
        else if (type.equalsIgnoreCase("mint")) {
            return new MintCandy();
        }

        return null;
    }
}