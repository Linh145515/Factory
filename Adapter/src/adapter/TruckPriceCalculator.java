package adapter;


public class TruckPriceCalculator implements PriceCalculator {
    private Double truckPrice;

    public TruckPriceCalculator(Double truckPrice) {
        this.truckPrice = truckPrice;
    }

    @Override
    public double calculatePrice() {
        return truckPrice * 1.2;
    }
}