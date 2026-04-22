package adapter;


public class UKCarPriceAdapter implements PriceCalculator {
    private UKCarPriceCalculator ukCalculator;

    public UKCarPriceAdapter(double price) {
        ukCalculator = new UKCarPriceCalculator(price);
    }

    @Override
    public double calculatePrice() {
        return ukCalculator.getPrice(1.3);
    }
}
