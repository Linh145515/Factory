package factory;

public class VietNamCandyStore extends CandyStore {

    @Override
    public Candy createCandy(String type) {
        if (type.equalsIgnoreCase("mint")) {
            return new MintCandy();
        }
        return null;
    }
}