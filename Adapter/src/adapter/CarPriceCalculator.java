package adapter;

public class CarPriceCalculator implements PriceCalculator {
    private Double carPrice;

    public CarPriceCalculator(Double carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public double calculatePrice() {
        return carPrice * 1.1; 
    }
}