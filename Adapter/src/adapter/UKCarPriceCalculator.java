package adapter;


public class UKCarPriceCalculator {
    private Double UKPrice;

    public UKCarPriceCalculator(Double UKPrice) {
        this.UKPrice = UKPrice;
    }

    public Double getPrice(double rate) {
        return UKPrice * rate;
    }
}
